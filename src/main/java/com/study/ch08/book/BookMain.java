package com.study.ch08.book;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean flag = true;

        Book[] books = new Book[3];
        BookRepository bookRepository = new BookRepository(books);
        BookService bookService = new BookService(bookRepository);

        while (flag) {

            System.out.println("[[ 책 등록 프로그램 ]]");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 조회");
            System.out.println("q. 책 등록 프로그램 종료");
            System.out.print("메뉴 선택 >>> ");
            selectedMenu = scanner.nextLine();

            if ("1".equals(selectedMenu)) {
                System.out.println("<<< 책 등록 >>>");

                String name = null;
                String type = null;
                String writer = null;
//                int emptyCount = 0;
//                for (int i = 0; i < books.length; i++) {
//                    if (books[i] == null) {
//                        emptyCount++;
//                    }
//                }
//                if (emptyCount == 0) {
//                    System.out.println("더 이상 책 등록 불가");
//                    continue;
//                }
                if (bookService.isFull()) {
                    System.out.println("더 이상 등록 할 수 없습니다.");
                    continue;
                }

                System.out.print("책 제목 : ");
                name = scanner.nextLine();
                System.out.print("책 종류 : ");
                type = scanner.nextLine();
                System.out.print("책 작가 : ");
                writer = scanner.nextLine();

                Book book = new Book(name, type, writer);
                bookService.append(book);

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 책 조회 >>>");
                bookService.showBookInfo();
            } else if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("<<< 프로그램을 종료 합니다. >>>");
                flag = false;
            } else {
                System.out.println("<<< 다시 입력하세요. >>>");
            }
        }
        System.out.println("프로그램이 종료 되었습니다.");

    }
}
