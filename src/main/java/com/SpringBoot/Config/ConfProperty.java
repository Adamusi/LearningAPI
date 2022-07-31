package com.SpringBoot.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.stereotype.Component;

/**
 * @author： lenovo
 * @date： 2022/7/21 10:50
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */

    @Component
    @ConfigurationProperties(prefix = "cn.com.my")


    public class ConfProperty {
        private String test1;
        private String test2;

        //必须有 set 方法
        public void setTest1(String test1) {
            this.test1 = test1;
        }

        //必须有 set 方法
        public void setTest2(String test2) {
            this.test2 = test2;
        }

        public String getTest1() {
            return test1;
        }

        public String getTest2() {
            return test2;
        }
}
