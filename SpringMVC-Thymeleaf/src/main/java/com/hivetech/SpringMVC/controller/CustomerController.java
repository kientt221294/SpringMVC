package com.hivetech.SpringMvc.controller;

import com.hivetech.SpringMvc.model.Customer;
import com.hivetech.SpringMvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String getlist(Model model) {
        List<Customer> listCustomer = customerService.listCustomer();
        model.addAttribute("customerList", listCustomer);
        model.addAttribute("abc", "hello there!!!");
        return "listCustomer";
    }
}
