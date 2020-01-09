package com.hivetech.SpringMVC.controller;

import com.hivetech.SpringMVC.model.Customer;
import com.hivetech.SpringMVC.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private static final Logger log = Logger.getLogger(CustomerController.class.getSimpleName());
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
//        Integer customerId = customerService.getNextMaxId();

        model.addAttribute("customer", new Customer());
        return "addCustomer";

    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveCustomer(@ModelAttribute Customer customer){
//        System.out.println(customer.getBirthday());
        boolean isUpdated = customerService.add(customer);
        log.info("Customer updated: " + isUpdated);
        return new ModelAndView("redirect:/");

    }

}
