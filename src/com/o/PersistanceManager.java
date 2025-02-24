package com.o;

public class PersistanceManager {
    private BookPersistence persistence;

    public PersistanceManager(BookPersistence persistence) {
        this.persistence = persistence;
    }

    public void saveBook(Books book) {
        persistence.save(book);
    }
}
