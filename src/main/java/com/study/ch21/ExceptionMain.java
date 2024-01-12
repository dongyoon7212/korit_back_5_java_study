package com.study.ch21;

public class ExceptionMain {

    public static void main(String[] args) {

        int[] numArray = new int[] {1, 2, 3, 4, 5};

        for (int i = 0; i < 6; i++) {
            try {
                System.out.println(numArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) { // 오류가 클래스로 존재
                System.out.println("예외 발생");
            }


        }

        System.out.println("프로그램 정상 종료");
    }

}
