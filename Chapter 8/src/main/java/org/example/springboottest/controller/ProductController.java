package org.example.springboottest.controller;

import jakarta.annotation.PostConstruct;
import org.example.springboottest.model.Product;
import org.example.springboottest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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

    // One way of doing it is by using RequestMethod.POST, and using @RequestParams
    // to get the values from the frontend
//    @RequestMapping(path = "/products",
//    method = RequestMethod.POST)
//    public String addProduct(@RequestParam String name,
//                             @RequestParam double price,
//                             Model model) {
//        Product p = new Product(name, price);
//        productService.addProduct(p);
//
//        var products = productService.findALl();
//        model.addAttribute("products", products);
//
//        return "products.html";
//    }

    // This second approach utilizes @PostMapping, which would be equal to
    // the RequestMethod.POST, and in the method's parameters the Product object
    // itself is passed, because Spring knows to match the values name and price (both
    // being attributes in the Product object), and creates the object automatically
    @PostMapping(path = "/products")
    public String addProduct(Product p, Model model) {
        productService.addProduct(p);

        var products = productService.findALl();
        model.addAttribute("products", products);

        return "products.html";
    }
}
