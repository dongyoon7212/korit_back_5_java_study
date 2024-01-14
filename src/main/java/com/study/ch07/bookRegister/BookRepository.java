package com.study.ch07.bookRegister;

import com.study.ch13.B;

public class BookRepository {
    void bookRepositoryDB(Book book) {
        System.out.println("레포지토리에서 DB로 전달");
        System.out.println("--------------------------");

        BookDB bookDB = new BookDB();
        bookDB.bookSaveDB(book);

    }
}
