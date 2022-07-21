package com.SpringBoot.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author： lenovo
 * @date： 2022/7/21 10:12
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
@Service
public class ScheduleTask {
    // 计数器
    int count1 = 1;
    int count2 = 1;

    // 每隔一秒执行一次
    @Scheduled(fixedRate = 1000)
    public void task1() {
        System.out.println(Thread.currentThread().getName() + " [task1] 每秒执行一次， 执行第 [" + count1 + "] 次");
        count1++;
    }

    // 每隔一秒执行一次
    @Scheduled(fixedRate = 1000)
    public void task2() {
        System.out.println(Thread.currentThread().getName() + " [task2] 每秒执行一次， 执行第 [" + count2 + "] 次");
        count2++;
    }

}
