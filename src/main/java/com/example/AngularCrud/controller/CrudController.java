package com.example.AngularCrud.controller;

import com.example.AngularCrud.model.Product;
import com.example.AngularCrud.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class CrudController {

        private final CrudService crudService;

    public CrudController(CrudService crudService) {
        this.crudService = crudService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = crudService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product newProduct = crudService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        Product updatedProduct = crudService.updateProduct(product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Long id) {
        crudService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
