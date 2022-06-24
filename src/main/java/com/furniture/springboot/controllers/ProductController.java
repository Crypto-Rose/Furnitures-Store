package com.furniture.springboot.controllers;

import com.furniture.springboot.entities.Product;
import com.furniture.springboot.repository.ProductRepository;
import com.furniture.springboot.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService service;

    @Autowired
    ProductRepository productRepository;

    // Get method
    @GetMapping("list-product")
    public List<Product> getAll() {
        return service.getAll();
    }
}
