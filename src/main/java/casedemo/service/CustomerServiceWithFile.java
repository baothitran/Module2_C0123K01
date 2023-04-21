package casedemo.service;


import casedemo.model.Customer;
import casedemo.utils.FileUtils;

import java.util.List;

public class CustomerServiceWithFile {
    public List<Customer> getAll(){

        List<Customer> customers = FileUtils.readDataFromFile("F:\\BaoThi\\C0123K1_Module2\\src\\main\\java\\casedemo\\data\\customer.csv", FileUtils.CLASS_CUSTOMER);

        return customers;
    }

    public void updateCustomerById(long id, Customer customer) {
    }
    public void deleteCustomerById(long id) {

    }
}
