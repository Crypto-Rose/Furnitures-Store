package com.furniture.springboot.services;

import com.furniture.springboot.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
