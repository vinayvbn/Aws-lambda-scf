package com.aws.lamda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionScan;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@FunctionScan
@ComponentScan(basePackages = {"com.aws.lamda"})
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionApplication.class, args);
    }

}
