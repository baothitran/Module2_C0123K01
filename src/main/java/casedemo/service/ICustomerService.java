package casedemo.service;

import casedemo.model.Book;
import casedemo.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Book> getAll();
    void updateCustomerById(long id, Customer customer);
    void deleteCustomerById(long id);
}
