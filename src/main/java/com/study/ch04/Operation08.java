package com.study.ch04;

public class Operation08 {
    public static void main(String[] args) {
        /*

        << 문제 >>

        복합대입연산(산술연산, 대입연산)

         */

        int num1 = 10;
        int num2 = 20;
        num1 = num1 + num2; //아래와 똑같음
        num1 += num2;
        num1 *= num2;
        num1 %= num2;

        System.out.println(num1);
    }
}
