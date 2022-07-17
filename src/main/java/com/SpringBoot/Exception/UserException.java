package com.SpringBoot.Exception;

import com.SpringBoot.Enums.MessageEnum;

/**
 * @title:UserException
 * @Author zhangziqiang
 * @Date: 2022/7/1715:50
 * @Description
 * @Version 1.0
 */

public class UserException extends RuntimeException {
        private Integer code;
        public UserException(MessageEnum messageEnum) {
            super(messageEnum.getMessage());
            this.code = messageEnum.getCode();
        }
        public Integer getCode() {
            return code;
        }
        public void setCode(Integer code) {
            this.code = code;
        }
}
