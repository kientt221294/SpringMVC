package com.hivetech.SpringMvc.service;

import com.hivetech.SpringMvc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer();
    Customer getCustomerById(int customerId);
    void add(Customer customer);
    void update(Customer customer);
    void delete(int id);
}
