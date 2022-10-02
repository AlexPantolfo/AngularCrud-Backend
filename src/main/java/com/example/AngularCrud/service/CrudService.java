package com.example.AngularCrud.service;

import com.example.AngularCrud.model.Product;
import com.example.AngularCrud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CrudService {

    private final CrudRepository crudRepository;

    @Autowired
    public CrudService(CrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Product> getAllProducts() {
        return crudRepository.findAll();
    }


    public Product addProduct(Product product) {
        return  crudRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return  crudRepository.save(product);
    }

    public void deleteProduct(Long id) {
        crudRepository.deleteProductById(id);
    }
}
