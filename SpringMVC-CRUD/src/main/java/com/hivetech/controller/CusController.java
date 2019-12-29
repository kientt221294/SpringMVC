package com.hivetech.controller;

import com.hivetech.dao.CusDao;
import com.hivetech.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class CusController {
    @Autowired
    CusDao dao;
    @RequestMapping("/viewCus")
    public String viewCus(Model m){
        List<Customer> list= dao.getListCustomer();
        m.addAttribute("listCus",list);
        return "viewCus";
    }
}
