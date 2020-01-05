package com.hivetech.SpringMVC.service;

import com.hivetech.SpringMVC.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer();
    Customer getCustomerById(int customerId);
    boolean add(Customer customer);
    boolean update(Customer customer);
    boolean delete(int id);
}
