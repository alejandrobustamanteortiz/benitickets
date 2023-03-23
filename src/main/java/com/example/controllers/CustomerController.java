package com.example.controllers;

import com.example.entities.Customer;
import com.example.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("/customers")
    public String findAll(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/customer-list";
    }

    @GetMapping("/customers/{id}")
    public String findById(Model model, @PathVariable Long id) {
        Optional<Customer> customerOptional = customerService.findById(id);

        if (customerOptional.isPresent()) {
            model.addAttribute("customerId", customerOptional.get());
        } else {
            model.addAttribute("error", "Not found");
        }
        return "customer/customer-detail";
    }

    @GetMapping("/customers/{id}/delete")
    public String deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
        return "redirect:/customers";
    }

    @GetMapping("/customers/{id}/editForm")
    public String showCustomerForm(Model model, @PathVariable Long id) {
        Optional<Customer> customerOptional = customerService.findById(id);

        if (customerOptional.isPresent()) {
            model.addAttribute("customerId", customerOptional.get());
        } else {
            model.addAttribute("error", "Not found");
        }
        return "mantenimiento-web"; //De momento, devolvemos al html mantenimiento.
    }
}
