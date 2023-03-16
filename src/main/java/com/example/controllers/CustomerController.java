package com.example.controllers;

import com.example.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("customers")
    public String findAll(Model model) {
        model.addAttribute("customer", customerService.findAll());
        return "customer/customer-list";
    }
}
