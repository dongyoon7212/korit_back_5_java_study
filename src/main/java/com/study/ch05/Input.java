package com.study.ch05;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        System.out.print("타이틀: ");
        scanner.nextLine();
        String title = scanner.nextLine(); //next() => 띄어쓰기가 있으면 입력 받기가 끝난다.

        System.out.println(title + ": " + (a + b + c));
    }
}
