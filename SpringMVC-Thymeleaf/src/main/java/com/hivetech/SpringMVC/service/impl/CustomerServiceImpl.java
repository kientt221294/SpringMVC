package com.hivetech.SpringMVC.service.impl;

import com.hivetech.SpringMVC.model.Customer;
import com.hivetech.SpringMVC.service.CustomerService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class CustomerServiceImpl implements CustomerService {
    private static final Logger LOGGER = Logger.getLogger(CustomerServiceImpl.class.getName());

    private JdbcTemplate jdbcTemplate;

    public CustomerServiceImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> listCustomer() {
        String sql = "select * from customers";
        List<Customer> listCustomer = jdbcTemplate.query(sql, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                Customer cus = new Customer();

                cus.setCustomerNumber(rs.getInt("customerNumber"));
                cus.setCustomerName(rs.getString("customerName"));
                cus.setContactLastName(rs.getString("contactLastName"));
                cus.setContactFirstName(rs.getString("contactFirstName"));
                cus.setPhone(rs.getString("phone"));
                cus.setAddressLine1(rs.getString("addressLine1"));
                cus.setAddressLine2(rs.getString("addressLine2"));
                cus.setCity(rs.getString("city"));
                cus.setState(rs.getString("state"));
                cus.setPostalCode(rs.getString("postalCode"));
                cus.setCountry(rs.getString("country"));
                cus.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
                cus.setCreditLimit(rs.getDouble("creditLimit"));
                cus.setBirthday(rs.getDate("birthday").toLocalDate());

                return cus;
            }
        });

        return listCustomer;
    }

    @Override
    public Customer getCustomerById(int customerId) {
        return null;
    }

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}