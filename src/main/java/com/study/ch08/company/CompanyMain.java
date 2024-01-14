package com.study.ch08.company;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu= null;
        boolean flag = true;

        Company[] companies = new Company[5];
        CompanyRepository companyRepository = new CompanyRepository(companies);
        CompanyService companyService = new CompanyService(companyRepository);

        while (flag) {
            System.out.println("[[ 회사 등록 프로그램 ]]");
            System.out.println("1. 회사 등록");
            System.out.println("2. 회사 조회");
            System.out.println("q. 회사 등록 프로그램 종료");
            System.out.print("메뉴 선택 >> ");
            selectedMenu = scanner.nextLine();

            if ("1".equals(selectedMenu)) {
                String name = null;
                String code = null;

                System.out.println("<<< 책 등록 >>>");

                if (companyService.isFull()) {
                    System.out.println("더 이상 등록 할 수 없습니다.");
                    continue;
                }

            } else if ("2".equals(selectedMenu)) {

            } else if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<< 프로그램을 종료합니다. >>>");
                flag = false;
            } else {
                System.out.println("<<< 다시 입력하세요. >>>");
            }
        }
        System.out.println("프로그램이 종료 되었습니다.");
    }
}
