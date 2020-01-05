package com.hivetech.SpringMVC.controller;

import com.hivetech.SpringMVC.model.Customer;
import com.hivetech.SpringMVC.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String getlist(Model model){
        List<Customer> listCustomer= customerService.listCustomer();
        model.addAttribute("customerList", listCustomer);
        return "listCustomer";
    }

//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public String addCustomer(Model model){
//        model.addAttribute("")
//    }
}
