package com.hzy.api.controller;

import com.hzy.service.utils.DateUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/date")
    public String getDate(){
        Date curDate = DateUtils.getCurDate();
        return "当前时间是："+curDate;
    }
}
