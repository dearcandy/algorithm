package com.java.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @className twoSum
 * @Description 两数之和
 * @Author DearCandy
 * @Date 2021/12/15 21:25
 * @Version 1.0.0
 **/
public class TwoSum {
    /*
    *
    * @Author DearCandy
    * @Description 暴力法
    * @Date 21:26 2021/12/15
    * @Param [nums, target]
    * @return int[]
    **/
    public int[] twoSum01(int[] nums, int target){
        int length = nums.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = i + 1; j < length; j++){
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    /*
    *
    * @Author DearCandy
    * @Description 哈希表保存差值
    * @Date 21:48 2021/12/16
    * @Param [nums, target]
    * @return int[]
    **/
    public int[] twoSum02(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no solution");
    }




    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int[] output = new TwoSum().twoSum02(input, 9);
        for (int index :output) {
            System.out.println(index);
        }

    }
}
