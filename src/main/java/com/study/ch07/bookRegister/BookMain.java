package com.study.ch07.bookRegister;

import com.study.ch13.B;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        String bookName;
        String bookType;
        String  bookCode;

        System.out.print("책 이름 >> ");
        bookName = scanner.nextLine();
        if (bookService.isEmptyString(bookName)) {
            System.out.println("다시 입력하세요.");
            return;
        }
        System.out.print("책 종류 >> ");
        bookType = scanner.nextLine();
        if (bookService.isEmptyString(bookType)) {
            System.out.println("다시 입력하세요");
            return;
        }
        System.out.println("책 코드 >> ");
        bookCode = scanner.nextLine();
        if (bookService.isEmptyString(bookCode)) {
            System.out.println("다시 입력하세요");
            return;
        }
        Book book = new Book(bookName, bookType, bookCode);

        bookService.bookRegisterEntity(book);

        System.out.println("프로그램 종료");
    }
}
