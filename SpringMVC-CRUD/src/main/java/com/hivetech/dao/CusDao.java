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
        return template.query("select * from Emp99", new RowMapper<Customer>() {
            public Customer mapRow(ResultSet rs, int row) throws SQLException {
                Customer cus = new Customer();
                cus.setCustomerName(rs.getString(1));
                cus.setContactLastName(rs.getString(2));
                cus.setContactFirstName(rs.getString(3));
                cus.setPhone(rs.getString(4));
                cus.setAddressLine1(rs.getString(5));
                cus.setAddressLine2(rs.getString(6));
                cus.setCity(rs.getString(7));
                cus.setState(rs.getString(8));
                cus.setPostalCode(rs.getString(9));
                cus.setCountry(rs.getString(10));
                cus.setSalesRepEmployeeNumber(rs.getInt(11));
                cus.setCreditLimit(rs.getDouble(12));
                cus.setBirthday(rs.getDate(13).toLocalDate());
                return cus;
            }
        });
    }
}
