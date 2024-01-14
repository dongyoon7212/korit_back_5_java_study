package com.study.ch13.practice;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CompanyService1 companyService1 = new CompanyService1(scanner);

        companyService1.create();
    }
}
