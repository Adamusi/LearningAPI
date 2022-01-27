package com.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： lenovo
 * @date： 2022/1/27 10:03
 * @modifiedBy：访问路径 http://localhost:8080/hello
 * @description：
 * @version: 1.0
 */
/**
*@Controller
 @ResponseBody
*/
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
