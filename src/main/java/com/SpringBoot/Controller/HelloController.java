package com.SpringBoot.Controller;

import com.SpringBoot.Enums.MessageEnum;
import com.SpringBoot.Exception.UserException;
import com.SpringBoot.Model.Result;
import com.SpringBoot.Model.User;
import com.SpringBoot.Utils.MessageUtil;
import org.jboss.logging.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author： lenovo
 * @date： 2022/1/27 10:03
 * @modifiedBy：访问路径 http://localhost:8080/user?userParams='zz'
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

//    @PostMapping(value = "/user")
//    public String userAdd(@RequestParam String userParams) throws Exception {
//        User user = new User();
//        user.setName(userParams);
//        if (userParams.length() > 4) { // 校验测试异常类
//            throw new UserException(MessageEnum.NAME_EXCEEDED_CHARRACTER_LIMIT);
//        }
//        return "成功";
//}


    /**
     * 保存一个用户
     * @param userParams
     * @return
     */
    @PostMapping(value = "/user")
    public Result userAdd(@RequestBody User userParams) throws Exception {
        User user = new User();
        user.setName(userParams.getName());
        user.setAge(userParams.getAge());
        if (userParams.getName().length() > 4) { // 校验测试异常类
            throw new UserException(MessageEnum.NAME_EXCEEDED_CHARRACTER_LIMIT);
        }
        return MessageUtil.success(user);
    }
}