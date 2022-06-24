package com.furniture.springboot.services;

import com.furniture.springboot.entities.Product;
import com.furniture.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> getAll(){
        return (List<Product>) repository.findAll();
    }
}
