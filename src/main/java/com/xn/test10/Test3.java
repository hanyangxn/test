package com.xn.test10;

import com.alibaba.fastjson.JSONObject;
import com.xn.pojo.BaiDuHyperParamsUtils;
import com.xn.pojo.BaiDuQaAnswerEntity;
import com.xn.pojo.BaiQaHyperParams;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/5.
 */
public class Test3 {

    public static void main(String[] args) {
//        Factorial factorial= new Factorial();
//        System.out.println("factorial(10)="+factorial.fact(10))

//        baiDuQaAnswerEntity.setRequest();
        BaiDuQaAnswerEntity baiDuQaAnswerEntity=new BaiDuQaAnswerEntity();
//        BaiDuQaAnswerEntity.QaAnswerUtil qaAnswerUtil=new BaiDuQaAnswerEntity.QaAnswerUtil();

        baiDuQaAnswerEntity.setBot_id("1");

        baiDuQaAnswerEntity.setLog_id("234");
        BaiQaHyperParams baiQaHyperParams=new BaiQaHyperParams();
        BaiDuHyperParamsUtils baiDuHyperParamsUtils=new BaiDuHyperParamsUtils();
        baiDuHyperParamsUtils.setBernard_level(1);
        baiDuHyperParamsUtils.setClient_session("123");
        baiDuHyperParamsUtils.setQuery("nichbu");

//        baiQaHyperParams.setQuery_info();



        baiQaHyperParams.setSlu_level("1");
        List<String> list=new ArrayList<String>();
        list.add("111111111111");
        baiQaHyperParams.setSlu_tags(list);
        baiQaHyperParams.setSlu_threhold("1.0");
        baiDuHyperParamsUtils.setHyper_params(baiQaHyperParams);
        baiDuQaAnswerEntity.setRequest(baiDuHyperParamsUtils);

        System.out.println(JSONObject.toJSONString(baiDuQaAnswerEntity));
    }
}
