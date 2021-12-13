package com.lime.pricerprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PricerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricerProviderApplication.class, args);
    }

}
