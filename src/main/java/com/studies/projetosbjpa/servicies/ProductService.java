package com.studies.projetosbjpa.servicies;

import com.studies.projetosbjpa.entities.Category;
import com.studies.projetosbjpa.entities.Product;
import com.studies.projetosbjpa.repositories.CategoryRepository;
import com.studies.projetosbjpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product finByID(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }

}
