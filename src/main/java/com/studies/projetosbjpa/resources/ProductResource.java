package com.studies.projetosbjpa.resources;

import com.studies.projetosbjpa.entities.Category;
import com.studies.projetosbjpa.entities.Product;
import com.studies.projetosbjpa.servicies.CategoryService;
import com.studies.projetosbjpa.servicies.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;
    @GetMapping
    public ResponseEntity<List<Product>> findAll(){
        List<Product> products = service.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByID(@PathVariable Long id){
        Product obj = service.finByID(id);
        return ResponseEntity.ok().body(obj);
    }
}
