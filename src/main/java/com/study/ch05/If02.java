package com.study.ch05;

public class If02 {
    public static void main(String[] args) {

        //사분면 만들기 (if문)

        int x = -8;
        int y = -2;

        if (x > 0) {
            if (y > 0) {
                System.out.println("1사분면");
            } else if (y < 0) {
                System.out.println("4사분면");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("2사분면");
            } else if (y < 0) {
                System.out.println("3사분면");
            }
        } else {
            System.out.println("(0,0)입니다.");
        }

    }
}
