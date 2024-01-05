package com.study.ch08;

public class TestB01 {

    int[] add(int x, int y) {
        int[] nums = new int[2];
        nums[0] = x;
        nums[1] = y;
        System.out.println("x + y = " + (nums[0] + nums[1]));

        return nums;
    }

}
