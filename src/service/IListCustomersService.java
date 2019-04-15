package service;

import model.Customer;

import java.util.List;

public interface IListCustomersService {
    void createCustomer();
    List<Customer> findAll();
}
