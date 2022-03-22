package com.leedcode.cn.practice.binarySearch;


/**
 * @author： lenovo
 * @date： 2022/2/16 14:49
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
public class SolutionBinarySearch {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int target = 8;
        int k = minEatingSpeed(piles, target);
        System.out.println("吃香蕉最小的速度" + k);

    }

    private static int minEatingSpeed(int[] piles, int target) {
        int left = 1;
        int right = 100000000;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (f(piles, mid) <= target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int f(int[] piles, int x) {
        int hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += piles[i] / x ;
            if(piles[i] % x > 0) {
                hours++;
            }
        }
        return hours;
    }
}



