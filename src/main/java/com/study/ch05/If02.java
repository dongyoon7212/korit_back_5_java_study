package com.study.ch05;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {

        //사분면 만들기 (if문)
        Scanner scanner = new Scanner(System.in);
        System.out.print("x와 y를 입력해주세요(띄어쓰기로 구분): ");
        int x = 0;
        int y = 0;
        x = scanner.nextInt();
        y = scanner.nextInt();


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
