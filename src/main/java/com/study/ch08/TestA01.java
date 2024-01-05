package com.study.ch08;

public class TestA01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;

        TestB01 testB01 = new TestB01();
        int[] nums1 = testB01.add(num, num2);
        System.out.println(nums1);
        testB01.add(20, 40);
    }
}
