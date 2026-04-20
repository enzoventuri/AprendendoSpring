package org.example.springboottest.controller;

import org.example.springboottest.model.Product;
import org.example.springboottest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findALl();
        model.addAttribute("products", products);

        return "products.html";
    }

    @RequestMapping(path = "/products",
    method = RequestMethod.POST)
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {
        Product p = new Product(name, price);
        productService.addProduct(p);

        var products = productService.findALl();
        model.addAttribute("products", products);

        return "products.html";
    }
}
