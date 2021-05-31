package com.samet.springbootproductmicroservices.repository;

import com.samet.springbootproductmicroservices.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product, Long> {


}
