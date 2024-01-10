package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayServicer = new ArrayService(initStrArray);
        arrayServicer.add("이동윤");
        arrayServicer.add("삼동윤");
        arrayServicer.add("사동윤");
        arrayServicer.add("오동윤");
        arrayServicer.add("육동윤");
        arrayServicer.add("칠동윤");

        System.out.println(arrayServicer.toString());

        System.out.println(arrayServicer.indexOf("사동윤"));

        arrayServicer.remove(3);

        System.out.println(arrayServicer.toString());

        System.out.println(arrayServicer.get(3));
    }
}
