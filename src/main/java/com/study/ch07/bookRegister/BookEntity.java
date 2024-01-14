package com.study.ch07.bookRegister;

public class BookEntity {
    void bookEntityRepository(Book book) {
        System.out.println("엔티티에서 레포지토리로 전달");
        System.out.println("----------------------------");

        BookRepository bookRepository = new BookRepository();
        bookRepository.bookRepositoryDB(book);
    }
}
