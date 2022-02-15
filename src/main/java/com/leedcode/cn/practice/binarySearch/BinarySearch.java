package com.leedcode.cn.practice.binarySearch;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author： lenovo
 * @date： 2022/2/14 14:39
 * @modifiedBy：
 * @description： 二分搜索总结
 * @version: 1.0
 */
public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1, 5, 8, 10, 10, 19};
        int target = 10;
        int a = binarySearch(nums, target);
        int[] b = searchRange(nums, target);
        System.out.println("二分搜索的结果值：" + a);
        System.out.println("二分搜索的结果值：" + Arrays.toString(b));
    }

    // 寻找一个数 704. ⼆分查找（简单)

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    //  在排序数组中查找元素的第⼀个和最后⼀个位置

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }

    private static int right_bound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] == target) {
                // 注意
                left = mid + 1;
            }
        }
        // 检查出界情况
        if (nums[right] != target || right < 0) {
            return -1;
        }
        return right;
    }


    private static int left_bound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] == target) {
                // 注意
                right = mid - 1;
            }
        }
        // 检查出界情况
        if (nums[left] != target || left >= nums.length) {
            return -1;
        }
        return left;
    }
}
