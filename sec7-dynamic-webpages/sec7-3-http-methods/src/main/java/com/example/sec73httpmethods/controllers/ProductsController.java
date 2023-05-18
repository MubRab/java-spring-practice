package com.example.sec73httpmethods.controllers;

import com.example.sec73httpmethods.models.Product;
import com.example.sec73httpmethods.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    //default of @RequestMapping is the GET method
    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    /**
     * This method uses the generic RequestMapping annotation with a specified method
     * and also requires name and price as parameters to construct the model (Product) object
     */
//    @RequestMapping(path = "/products", method = RequestMethod.POST)
//    public String addProduct(@RequestParam String name, @RequestParam double price, Model model) {
//        Product p = new Product();
//        p.setName(name);
//        p.setPrice(price);
//        productService.addProduct(p);
//
//        var products = productService.findAll();
//        model.addAttribute("products", products);
//
//        return "products.html";
//    }

    /**
     * This method uses a specific annotation and directly uses the model (Product)
     * as the parameter
     */
    @PostMapping("/products")
    public String addProduct(Product p, Model model) {
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}
