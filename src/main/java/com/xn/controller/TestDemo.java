//package com.xn.controller;
//
//import com.xn.pojo.User;
//import com.xn.service.UserService;
//import com.xn.service.UserTwoService;
//import com.xn.service.impl.UserServiceImpl2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.List;
//
///**
// * Created by Administrator on 2018/6/5.
// */
//@Controller
//@RequestMapping("userss")
//public class TestDemo {
//    @Autowired
//    private UserService uService;
//
//    @Autowired
//    private UserTwoService service;
//
//    @RequestMapping("getList1")
//    public String getList(Model model, HttpServletRequest request) {
////        HttpSession session = request.getSession();
////        session.setAttribute("name","zhangsan");
//        List<User> list = uService.getList();
//        model.addAttribute("list",list);
//        System.out.println(list);
////        iRedisService.setList("list",list);
//        return "ok";
//    }
//    @RequestMapping("getList2")
//    public String getList2(Model model, HttpServletRequest request) {
////        HttpSession session = request.getSession();
////        session.setAttribute("name","zhangsan");
//        List<User> list = service.getList();
//        model.addAttribute("list",list);
//        System.out.println(list);
////        iRedisService.setList("list",list);
//        return "ok";
//    }
//}
