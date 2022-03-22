package com.leedcode.cn.practice.binarySearch;

/**
 * @author： lenovo
 * @date： 2022/2/16 14:49
 * @modifiedBy：
 * @description： 给定字符串s和t，判断s是否为t的⼦序列。
 * @version: 1.0
 */
public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgd3";
        boolean subsequence = isSubsequence(s, t);
        System.out.println("判定子序列" + subsequence);
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}



