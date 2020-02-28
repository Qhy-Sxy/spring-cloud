package com.aaa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 14:55
 */
@Controller
public class TestController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("hai")
    @ResponseBody
    public String hai(){
        return "hai+"+port;
    }
}
