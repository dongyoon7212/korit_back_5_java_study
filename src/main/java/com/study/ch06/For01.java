package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        // for문 => 반복횟수가 정해져있고 일정한 간격으로 증감되면서 반복되어야 할때, 반복횟수가 중심
        for (int i = 0; i < 10; i++/*후처리*/) { // fori
            System.out.println("i: " + i);
        }

        //while문 => 조건이 중심
        int i = 0;
        while (i < 10) {
            System.out.println("i :" + i);
            i++;
        }
    }
}
