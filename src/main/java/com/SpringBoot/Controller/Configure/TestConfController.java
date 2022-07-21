package com.SpringBoot.Controller.Configure;

import com.SpringBoot.Config.ConfProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author： lenovo
 * @date： 2022/7/21 10:52
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */

@Controller
public class TestConfController {
    @Autowired
    private ConfProperty confProperty;

    @RequestMapping("test/conf")
    @ResponseBody
    public String getTest() {
        return "TestConfController - test1: " + confProperty.getTest1() + ", test2: " + confProperty.getTest2();
    }
}
