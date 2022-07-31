package com.SpringBoot.Controller.URLRequest;

import com.SpringBoot.Model.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author： zhangziqiang
 * @date： 2022/7/21 13:39
 * @modifiedBy：
 * @description：Spring Boot 获取URL请求参数的方法
 * @version: 1.0
 */
@RestController
@Slf4j
public class TestURLController {

    //1.通过 @RequestParam 注解获取 url 参数 @RequestParam：将请求参数绑定到控制器的方法参数。
    // @RequestParam(value="参数名", required="true/false", defaultValue=" ")

    @GetMapping("/adduser")
    public String addUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "username is:"+username + " " + "password is:"+password;
    }

    //2.把 url 参数写在 Controller 相应的方法的形参中

    @RequestMapping("/adduser")
    public String addUser2(String username,String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "username is:"+username + " " + "password is:"+password;
    }

    //3.通过 HttpServletRequest 接收参数

    @RequestMapping("/adduser")
    public String addUser3(HttpServletRequest request) {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "username is:"+username + " " + "password is:"+password;
    }

    //4.通过 bean 接收参数

    @RequestMapping("/adduser")
    public String addUser4(UserModel user) {
        System.out.println("username is:"+user.getUsername());
        System.out.println("password is:"+user.getPassword());
        return "username is:"+user.getUsername() + " " + "password is:"+user.getPassword();
    }

    // 5.1.在@GetMapping 或者 @RequestMapping 中使用 {xxx} 占位符; 5.2. 使用 @PathVariable("xxx") 绑定到操作方法的形参中

    @GetMapping("/user/{username}")
    public String getUser(@PathVariable("username") String username){
        System.out.println("username=" + username);
        return "username=" + username;
    }

   // 6.Spring Boot 获取Post Body参数的方法(用这个bean来封装接收的参数)

   @PostMapping("/addUser")
   public String addUser(@RequestBody UserModel user) {
       System.out.println("username is:"+user.getUsername());
       System.out.println("password is:"+user.getPassword());
       return "username is:"+user.getUsername() + " " + "password is:"+user.getPassword();
   }
}
