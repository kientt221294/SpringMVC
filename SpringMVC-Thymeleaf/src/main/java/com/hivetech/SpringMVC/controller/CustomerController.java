package com.hivetech.SpringMvc.controller;

import com.hivetech.SpringMvc.model.Customer;
import com.hivetech.SpringMvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
        return "listCustomer";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addCustomer(Model model){
        model.addAttribute("customer", new Customer());
        return "addCustomer";

    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCustomer(@ModelAttribute Customer customer){
        customerService.add(customer);
        return "redirect:/";

    }
}
