package com.xn.controller;

import com.xn.lambdaTest.Formula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lambde")
public class LamadaTestController {

    @Autowired
    private Formula formula;

    @RequestMapping("sqrt")
    public double sqrt(Integer num){
        double sqrt = formula.sqrt(num);
        return sqrt;
    }
}
