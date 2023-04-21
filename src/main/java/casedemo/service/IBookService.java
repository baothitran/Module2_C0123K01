package casedemo.service;


import casedemo.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    Book findBookById(long idBook);
    void updateBookById(long id, Book book);
    void deleteBookById(long id);
}
