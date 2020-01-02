package com.hivetech.dao;

import com.hivetech.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CusDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List<Customer> getListCustomer() {
        return template.query("select * from customers", new RowMapper<Customer>() {
            public Customer mapRow(ResultSet rs, int row) throws SQLException {
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
    }
}
