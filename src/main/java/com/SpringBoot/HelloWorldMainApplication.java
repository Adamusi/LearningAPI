package com.SpringBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
// 开启定时任务
// @EnableScheduling
@SpringBootApplication
@Slf4j
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
        log.info("============");
    }
}