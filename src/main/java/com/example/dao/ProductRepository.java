package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, String> {

}
