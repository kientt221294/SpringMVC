package com.hivetech.SpringMvc.service;

import com.hivetech.SpringMvc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer();
    Customer getCustomerById(int customerId);
    boolean add(Customer customer);
    boolean update(Customer customer);
    boolean delete(int id);
}
