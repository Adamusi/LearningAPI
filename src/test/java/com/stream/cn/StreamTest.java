package com.stream.cn;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author： lenovo
 * @date： 2022/1/29 11:16
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
public class StreamTest {

    @Test
    public void TestTrace() {
        Stream.of("beijing","tianjin","shanghai","wuhan")
                .map(String::length)
                .filter(e->e>5)
                .collect(Collectors.toList());
    }
}
