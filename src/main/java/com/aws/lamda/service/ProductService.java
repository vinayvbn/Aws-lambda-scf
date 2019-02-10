package com.aws.lamda.service;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.aws.lamda.domain.Product;
import com.aws.lamda.helper.DynamoDBManager;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    private static final DynamoDBMapper mapper = DynamoDBManager.mapper();

    ProductService() {
    }


    public Product saveProduct(Product product) {
        mapper.save(product);

        return product;
    }

}
