package com.hivetech.SpringMVC.service;

import com.hivetech.SpringMVC.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer();
    Customer getCustomerById(int customerId);
    Integer getNextMaxId();
    boolean add(Customer customer);
    void update(Customer customer);
    void delete(int id);
}
