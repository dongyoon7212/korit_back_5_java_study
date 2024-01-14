package com.study.ch13.practice;

import java.util.Scanner;

public class CompanyService1 {
    private Scanner scanner;

    public CompanyService1(Scanner scanner) {
        this.scanner = scanner;
    }

    public void create() {
        System.out.println("공장 생성");
        System.out.print("모델명 입력 >> ");
        String modelName = scanner.nextLine();

        Company company = Company.getInstance();

        company.setCompanyName("다이소");
        Product product = company.produce(modelName);
        System.out.println(product);
    }
}
