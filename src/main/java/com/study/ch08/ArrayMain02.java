package com.study.ch08;

public class ArrayMain02 {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "이동윤";
        names[1] = "이수진";
        names[2] = "이장우";
        names[3] = "양경옥";
        names[4] = "장현원";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
