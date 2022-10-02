package com.example.AngularCrud.repository;

import com.example.AngularCrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<Product, Long> {

    void deleteProductById(Long id);
}
