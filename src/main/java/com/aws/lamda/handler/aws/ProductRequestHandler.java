package com.aws.lamda.handler.aws;

import com.aws.lamda.domain.Product;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class ProductRequestHandler extends SpringBootRequestHandler<Product, Product> {
}
