package com.study.ch06;

public class For02 {
    public static void main(String[] args) {
        /*
        <<문제>>
        *
        * 4, 3, 2, 1, 0
        * */

        int n = 10;
        for (int j = 0; j < n; j++) {
            int rv_j = n - 1 - j; //****
            System.out.print(rv_j);
            if(rv_j % 5 != 0) {
                System.out.print(", ");
            }
            if(rv_j % 5 == 0) {
                System.out.println();
            }
        }

        /*
         * 0, 1, 2, 3, 4
         * 5, 6, 7, 8, 9
        * */
        System.out.println();
        System.out.println();


        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if(i % 5 != 4) {
                System.out.print(", ");
            }
            if(i % 5 == 4) {
                System.out.println();
            }
        }

        System.out.println();
        System.out.println();

        /*
        * 9, 8, 7, 6, 5
        * 4, 3, 2, 1, 0
        * */

        for (int j = 9; j > -1; j--) {
            System.out.print(j);
            if(j % 5 != 0) {
                System.out.print(", ");
            }
            if(j % 5 == 0) {
                System.out.println();
            }
        }

    }
}
