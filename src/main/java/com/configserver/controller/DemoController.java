package com.configserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jyou on 2018/9/10.
 *
 * @author jyou
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

//    @Value("${test}")
    private String test;

    @RequestMapping("/index")
    public String index(){
        return test;
    }
}
