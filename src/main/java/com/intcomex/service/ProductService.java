package com.intcomex.service;

import com.intcomex.entity.Category;
import com.intcomex.entity.Product;
import com.intcomex.repository.CategoryRepository;
import com.intcomex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> generateRandomProducts(int count) {
        List<Category> categories = categoryRepository.findAll();
        if (categories.size() < 2) throw new RuntimeException("Debe haber al menos 2 categorías");

        Random random = new Random();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Category category = categories.get(random.nextInt(2));
            Product product = new Product();
            product.setName("Producto " + i);
            product.setUnitPrice(BigDecimal.valueOf(100 + random.nextDouble() * 900));
            product.setStock(random.nextInt(100));
            product.setCategory(category);
            products.add(product);
        }
        productRepository.saveAll(products);
        return products;
    }
}