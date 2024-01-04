package com.study.ch06;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("별 몇개? :");

        int starCount = scanner.nextInt();

        for (int i = 0; i < starCount; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * 역으로 별찍기
        * */

        System.out.println();
        System.out.println();

        for(int i = 0; i < starCount; i++) {
            for(int j = 0; j < starCount - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * 들여쓰기 별찍기
        * */

        System.out.println();
        System.out.println();

        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * 들여쓰기 역으로 별찍기
        * */

        System.out.println();
        System.out.println();

        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCount - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        * 트리만들기
        * */

        System.out.println();
        System.out.println();

        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
