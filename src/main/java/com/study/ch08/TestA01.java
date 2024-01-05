package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int[] nums = new int[3];

        TestB01 testB01 = new TestB01();

        testB01.add(nums, num, num2);
        testB01.showArrayDatas(nums);

        testB01.add(nums, 20, 40);
        testB01.showArrayDatas(nums);
    }
}
