package com.samsung.basicsecurity.controller;

import com.samsung.basicsecurity.repositories.ProductRepository;
import com.samsung.basicsecurity.repositories.models.Product;
import com.samsung.basicsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public String welcome(final Model model) {
        List<Product> lstProducts = productRepository.getDummyProducts();
        model.addAttribute("products", lstProducts);
        return "welcome";
    }

    @GetMapping("/home")
    public String home() {
        return "welcome";
    }
}
