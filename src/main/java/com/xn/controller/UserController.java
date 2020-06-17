package com.xn.controller;

import com.mongodb.MongoClient;
import com.xn.entity.AiBuildRuleEntity;
import com.xn.pojo.User;
import com.xn.service.IRedisService;
import com.xn.service.UserService;
import com.xn.sync.Help;
import com.xn.sync.Tree;
import com.xn.sync.Task;
import com.xn.test.Halp;
import com.xn.test.Hello;
import com.xn.util.*;
import io.opentracing.contrib.mongo.TracingMongoClient;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.*;

/**
 * Created by Administrator on 2018/1/2.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    RestTemplate restTemplate;

//    @Autowired
//    private StringRedisTemplate iRedisService;
    @Autowired
    private IRedisService iRedisService;

    @RequestMapping("getUserList")
    public String getUserList(Model model,HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name","zhangsan");
        List<User> list = service.getList();
        service.getListener();
        model.addAttribute("list",list);
        System.out.println(list);
        iRedisService.setList("list",list);
//        iRedisService.boundValueOps("bar").get();

//        List<AiBuildRuleEntity> list1 = mongoTemplate.findAll(AiBuildRuleEntity.class);

//        restTemplate.getForObject("http://localhost:7777/user/getUserList", String.class);
        return "ok";
    }
    @RequestMapping("aaaa")
    public String aaaa() {
        try {
            Tree.Node rootNode = Tree.root ;
            Help h = new Help() ;
            Task rootTask = (Task) h.instanceTaskObj(rootNode);
            Map data=new HashMap();
            data.put("1","nihao1");
            data.put("2","nihao2");
            data.put("3","nihao3");
            data.put("4","nihao4");
            rootTask.execute(rootNode, data, null, null) ;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "chat";
    }
    @RequestMapping("bb")
    public String bb() throws Exception{
        Halp halp=new Halp();
        Hello hello = halp.instanceTaskObj();
        hello.sang("沙漠骆驼");
        return "ok";
    }


    @RequestMapping("queryOne")
    public String queryOne() {
//        model.addAttribute("word","我爱你啊");
        return "index";
    }
    //处理文件上传
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public @ResponseBody String uploadImg(@RequestParam("file") MultipartFile file,
                                          HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        System.out.println("request.getSession()"+request.getSession());
        System.out.println("request.getSession().getServletContext()"+request.getSession().getServletContext());
        System.out.println("request.getSession().getServletContext().getRealPath(\"imgupload/\")"+request.getSession().getServletContext().getRealPath("imgupload/"));

        System.out.println(ClassUtils.getDefaultClassLoader().getResource("").getPath());
        System.out.println(filePath);
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return "uploadimg success";
    }

    @ResponseBody
    @RequestMapping(value="/batchImport", method = RequestMethod.POST)
    public String batchImportUserKnowledge(@RequestParam(value = "file") MultipartFile file,
                                                 String knowledgeUuid) throws IOException {

            int total = 0;
            long startMili = System.currentTimeMillis();// 当前时间对应的毫秒数
            //判断文件是否为空
            if (file == null) {
                return ("文件不能为空");
            }
            //获取文件名
            int filesize=file.getOriginalFilename().length();
            String fileName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("\\")+1,filesize);
//
//            String fileName = file.getOriginalFilename().substring(file.getOriginalFilename().indexOf(".")-1, filesize);
            //验证文件名是否合格
            if (!ExcelImportUtils.validateExcel(fileName)) {
                return("文件类型不正确,请上传excel文件");
            }
            //进一步判断文件内容是否为空（即判断其大小是否为0或其名称是否为null）
            long size = file.getSize();
            if (StringUtils.isEmpty(fileName) || size == 0) {
                return ("文件内容不可为空");
            }
            String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
            //批量导入
            String tempUrl = path + "/" + "uploadTemp" + "/";
            System.out.println("______________________________>"+tempUrl);
            File uploadDir = new File(tempUrl);
            //创建一个目录 （它的路径名由当前 File 对象指定，包括任一必须的父路径。）
            if (!uploadDir.exists()) uploadDir.mkdirs();
            //新建一个文件
            File tempFile = new File(tempUrl + new Date().getTime() + fileName);
            //初始化输入流
            InputStream is_1 = null;
            InputStream is_2 = null;
            try {
                file.transferTo(tempFile);
                //根据新建的文件实例化输入流
                is_1 = new FileInputStream(tempFile);
                //根据版本选择创建Workbook的方式
                Workbook wb = null;
                try {
                    wb = new XSSFWorkbook(is_1);
                } catch (Exception ex) {
                    is_1.close();
                    is_2 = new FileInputStream(tempFile);
                    wb = new HSSFWorkbook(is_2);
                }
                //查询该知识库下所有问题
//                List<String> questions = aiQuestionService.findAllQuestionsByKB(knowledgeUuid);
                List<KnowledgeExcelEntity> excelEntities = new ArrayList<KnowledgeExcelEntity>();
                String errorMsg = readExcelValue(excelEntities, wb, knowledgeUuid, tempFile);
                total = excelEntities.size();
                int workSize = 0;
                int workNum = 0;
                if (total > 200 && total <= 500) {
                    workSize = 100;
                    workNum = total % 100 == 0 ? total / 100 : total / 100 + 1;
                } else if (total >= 50 && total <= 200) {
                    workSize = 50;
                    workNum = total % 50 == 0 ? total / 50 : total / 50 + 1;
                }/*else if(2000<total&&total<5000){
                    workSize=300;
					workNum=total%300==0?total/300:total/300+1;
				}*/
                if (StringUtils.isBlank(errorMsg)) {
                    //查询该公司的限制条数
//                    Integer numLimit = aiQuestionService.queryCompanyLimitNumber(companyUuid);
//                    //查询该公司下知识库已有的问答对有效条数
//                    Integer numQuest = aiQuestionService.queryCompanyQuestionNumber(companyUuid);
                    Integer numLimit =0;
                    Integer numQuest=100;
                    Integer excelSize = excelEntities.size() + numQuest;
                    if (numLimit == 0 || excelSize < numLimit) {

                        for (KnowledgeExcelEntity knowledgeExcelEntity :  excelEntities) {
                            System.out.println(knowledgeExcelEntity);
                        }
//                        if (excelEntities.size() > 50 && excelEntities.size() <= 500) {
//                            excelImportService.saveExcelDataMultiWork(excelEntities, userUuid, knowledgeUuid, workSize, workNum);
//                            log.info("批量导入执行完毕......");
//                        } else if (excelEntities.size() <= 50) {
//                            excelImportService.saveExcelData(excelEntities, userUuid, knowledgeUuid);
//                        } else {
//                            return ResponseData.customerError().putDataValue("msg", "问答对一次性导入不可超过500条记录!");
//                        }
//                    } else {
//                        if (excelSize > numLimit) {
//                            return ResponseData.customerError().putDataValue("msg", "问答对超过最大条数限制,请联系小能！");
//                        }
                    }
                } else {
                    return (errorMsg);
                }
            } catch (Exception e) {
                e.printStackTrace();
//                log.error("批量导入异常,用户信息为:" + user.toString() + "知识库id为" + knowledgeUuid + "操作时间:" + new Date().toString());
                return ("导入出现异常,请稍后再试...");
            } finally {
                if (is_2 != null) {
                    try {
                        is_2.close();
                    } catch (IOException e) {
                        is_2 = null;
                        e.printStackTrace();
                    }
                }
            }
            long endMili = System.currentTimeMillis();
            System.out.println("excel批量导入总耗时为：" + (endMili - startMili) + "毫秒");
            return ("导入成功");
    }

    public String readExcelValue(List<KnowledgeExcelEntity> excelEntities, Workbook wb, String knowledgeUuid, File tempFile) {

        Map<String, Integer> mapList = new HashMap<String, Integer>();
        //错误信息接收器
        String errorMsg = "";
        //得到第一个shell
        Sheet sheet = wb.getSheetAt(0);
        //得到Excel的行数
        int totalRows = sheet.getPhysicalNumberOfRows();
        if(totalRows < 3 ){
            errorMsg = "Excel文件没有导入的内容，请仔细查看!";
            return errorMsg;
        }
        //总列数
        int totalCells = 0;
        //得到Excel的列数(前提是有行数)，从第二行算起
        if (totalRows >= 3 && sheet.getRow(1) != null) {
            totalCells = sheet.getRow(1).getPhysicalNumberOfCells();
        }
        String br = "<br/>";

        //循环Excel行数,从第三行开始。标题不入库
        for (int r = 2; r < totalRows; r++) {
            String rowMessage = "";
            Row row = sheet.getRow(r);
            if (row == null) {
                errorMsg += br + "第" + (r + 1) + "行数据有问题，请仔细检查！";
                continue;
            }
            String question = "";
            String answer = "";

            //循环Excel的行
            KnowledgeExcelEntity entity = new KnowledgeExcelEntity();
            List<String> similarities = new ArrayList<String>();
            int blankNum = 0;
            for (int c = 0; c < totalCells; c++) {
                Cell cell = row.getCell(c);
                if (null != cell || c > 1) {
                    if (c == 0) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        question = cell.getStringCellValue();
                        if (StringUtils.isEmpty(question)) {
                            rowMessage += "问题不能为空；";
                            blankNum++;
                        } else if (question.length() > 50) {
                            rowMessage += "问题的字数不能超过50；";
                        }
                        entity.setQuestion(question);
                    } else if (c == 1) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        answer = cell.getStringCellValue();
                        if (StringUtils.isEmpty(answer)) {
                            blankNum++;
                            rowMessage += "答案不能为空;";
                        } else if (answer.length() > 1000) {
                            rowMessage += "答案的字数不能超过1000;";
                        }
                        entity.setAnswer(answer);
                    } else if (c >= 2) {
                        if (null != cell) {
                            cell.setCellType(Cell.CELL_TYPE_STRING);
                            String similarity = cell.getStringCellValue();
                            if (StringUtils.isNotBlank(similarity)) {
                                if (similarity.length() > 50) {
                                    rowMessage += "第" + (c + 1) + "列相似问题的字数不能超过50；";
                                }
                            }
                        }
                    }
                } else {
                    rowMessage += "第" + (c + 1) + "列数据有问题，请仔细检查；";
                }
                entity.setSimilarQuestion(similarities);
            }
            if (blankNum == 2) {
                continue;//如果问题和答案为空,跳过该问题
            }
            //拼接每行的错误提示
            if (!StringUtils.isEmpty(rowMessage)) {
                errorMsg += br + "第" + (r + 1) + "行，" + rowMessage;
            } else {
                excelEntities.add(entity);
            }
        }
        //删除上传的临时文件
        if (tempFile.exists()) {
            tempFile.delete();
        }
        return errorMsg;
    }
    @RequestMapping("/downloadKB")
    public void downloadKB( String secretStr,
                           HttpServletRequest request, HttpServletResponse response) throws IOException {
        String companyUuid = "";
//        if (StringUtils.isNotBlank(secretStr)) {
//            boolean isAuthenticated = JwtUtil.authenticate(AiConstants.DOWNLOAD_KB_SECRET_KEY, secretStr);
//                Map<String, Claim> decode = JwtUtil.decode(secretStr);
//                Claim companyStr = decode.get("companyId");
//                companyUuid = companyStr.asString();
//                AiKnowledgeEntity know = aiKnowledgeService.queryObject(knowledgeUuid);

                String agent = request.getHeader("USER-AGENT").toLowerCase();
                System.out.println("=================================>"+agent);
                response.setContentType("application/vnd.ms-excel");
                String outFileName = "测试模板";
//                if (null != know)
//                    outFileName = know.getName();
                String filenameSend = "";
                if (agent != null && agent.toLowerCase().indexOf("firefox") > 0) {
                    filenameSend = "=?UTF-8?B?" + (new String(org.apache.commons.codec.binary.Base64.encodeBase64(outFileName.getBytes("UTF-8")))) + "?=";
                } else {
                    filenameSend = java.net.URLEncoder.encode(outFileName, "UTF-8");
                }
                if (agent.contains("firefox")) {
                    response.setCharacterEncoding("utf-8");
                    response.setHeader("content-disposition", "attachment;filename=" + filenameSend + ".xls");
                } else {
                    response.setHeader("content-disposition", "attachment;filename=" + filenameSend + ".xls");
                }
                File file = ResourceUtils.getFile("classpath:excelTemplate/template.xlsx");
                String fileName = file.getName();
                Workbook wb = null;
                InputStream is = new FileInputStream(file);
                //根据文件名判断文件是2003版本还是2007版本
                if (ExcelImportUtils.isExcel2007(fileName)) {
                    wb = new XSSFWorkbook(is);
                    is.close();
                } else {
                    wb = new HSSFWorkbook(is);
                    is.close();
                }
                Sheet sheet = wb.getSheetAt(0);
                    String question = "";
                    String answer = "";
                    String questionId = "";
                    //去数据库中查询所有问题,答案
//                    List<AiQuestionBasicVo> basicList = aiQuestionService.findQABasicList(knowledgeUuid, companyUuid);
//                    AiQuestionBasicVo questionVo = null;
//                    //去数据库中查询相似问题id与问题id关联对象
//                    List<AiSimilarQuestionVo> similarList = aiQuestionService.findSimilariList(knowledgeUuid);

                    List<String> similarQuestionIds = new ArrayList<String>();
                    List<String> parentQuestions = new ArrayList<String>();
//                    for (int j = 0; j < similarList.size(); j++) {
//                        similarQuestionIds.add(similarList.get(j).getQuestionUuid());
//                        parentQuestions.add(similarList.get(j).getParentUuid());
//                    }
                        similarQuestionIds.add("你擦车了吗");
                        parentQuestions.add("洗车了吗");
//                    if (null != basicList && basicList.size() > 0) {
//                        for (int i = 0; i < basicList.size(); i++) {
//                            questionVo = basicList.get(i);
                            question ="你的车呢";
                            answer = "丢了啊";
                            questionId = "123";
                            //插入数据到excel
                            Row row = sheet.createRow(0 + 2);//从第三行开始
                            Cell first = row.createCell(0);
                            first.setCellValue(question);
                            Cell second = row.createCell(1);
                            second.setCellValue(answer);
//                            if (parentQuestions.contains(questionId)) {
//                                int num = 2;
//                                for (AiSimilarQuestionVo similarQue : similarList) {
//                                    //说明有相似问题,遍历相似问题,取出相似问题,插入到excel
//                                    if (questionId.equals(similarQue.getParentUuid())) {
//                                        Cell similar = row.createCell(num);
//                                        similar.setCellValue(similarQue.getQuestion());
//                                        num++;
//                                    }
//                                }
//                            }
//                        }
//                    }

                OutputStream out = response.getOutputStream();
                wb.write(out);

        }

    }
//}
