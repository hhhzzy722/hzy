package com.hzy.api.controller;

import com.hzy.application.utils.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {


    @RequestMapping("/date")
    public String getDate(){
        Date curDate = DateUtils.getCurDate();
        return "当前时间是："+curDate;
    }

    @RequestMapping("index")
    public String index(){
        return "/user/index";
    }
}
