package com.aws.lamda;


import com.aws.lamda.domain.Product;
import com.aws.lamda.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("Productfunction")
public class Productfunction implements Function<Product, Product> {
    @Autowired
    private ProductService service;


    public void setService(ProductService service) {
        this.service = service;
    }


    @Override
    public Product apply(Product product) {
        return service.saveProduct(product);
    }
}
