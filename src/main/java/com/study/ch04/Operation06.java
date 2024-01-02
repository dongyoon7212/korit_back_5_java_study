package com.study.ch04;

public class Operation06 {

    public static void main(String[] args) {

        /*
        * <<문제>>
        *
        * 조건연산자 ( 삼항연산자 )
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        *
        * */

        int iResult = 10 > 2 ? 1111 : 2222;
        String sResult = 10 > 2 ? "1111" + 1 : "2222"; //결과값안에서 연산자 사용가능, 연산자 안에 삼항연산자 사용가능
        // 결과 값의 자료형이 일치해야함
        Boolean bResult = 10 > 2 ? true : false; // == boolean bResult = 10 > 2;

        System.out.println(iResult);
        System.out.println(sResult);
        System.out.println(bResult);

        Boolean.parseBoolean("ture");

        //대문자 자료형은 null값도 포함시킬 수 있다.

//        String name = null; // ""는 변수가 비어있는것이 아님, null이어야 비어있는 것
//        System.out.println(name == null);

        String name = "이동윤";
        String name2 = new String("이동윤");

        boolean b = name == name2; // false
        boolean c = name == "이동윤"; // true

        System.out.println("테스트 코드 작성");


    }

}
