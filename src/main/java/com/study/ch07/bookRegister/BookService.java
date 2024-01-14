package com.study.ch07.bookRegister;

public class BookService {
    boolean isEmptyString(String str) {
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }

    void bookRegisterEntity(Book book) {
        System.out.println("서비스에서 엔티티로 전달");
        System.out.println("------------------------------");

        BookEntity bookEntity = new BookEntity();
        bookEntity.bookEntityRepository(book);
    }

}
