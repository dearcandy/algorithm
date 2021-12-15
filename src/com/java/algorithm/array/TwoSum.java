package com.java.algorithm.array;

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
    public int[] twoSum(int[] nums, int target){
        int length = nums.length;
        for (int i = 0; i < length - 1; i++){
            for (int j = i + 1; j < length; j++){
                return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("no solution");
    }



    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int[] output = new TwoSum().twoSum(input, 9);
        for (int index :output) {
            System.out.println(index);
        }

    }
}
