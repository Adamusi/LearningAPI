package com.SpringBoot.Controller.Configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： lenovo
 * @date： 2022/7/21 10:44
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
@RestController
@Slf4j
public class TestValueController {

    @Value("${cn.com.my.test1}")
    private String test1;
    @Value("${cn.com.my.test2}")
    private String test2;

    @RequestMapping("/test/value")
    public String getTest(){
        return "TestValueController - test1: " + test1 +", test2: "+test2;
    }

}
