package com.eudes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eudes.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
