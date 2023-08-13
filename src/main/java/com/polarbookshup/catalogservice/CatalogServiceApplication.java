package com.polarbookshup.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(CatalogServiceApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
