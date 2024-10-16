package org.voicetheinvoice.vti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voicetheinvoice.vti.model.Products;
import org.voicetheinvoice.vti.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products createProduct(Products product) {
        return productRepository.save(product);
    }
}
