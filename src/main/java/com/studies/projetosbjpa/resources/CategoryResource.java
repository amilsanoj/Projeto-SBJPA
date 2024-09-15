package com.studies.projetosbjpa.resources;

import com.studies.projetosbjpa.entities.Category;
import com.studies.projetosbjpa.entities.User;
import com.studies.projetosbjpa.servicies.CategoryService;
import com.studies.projetosbjpa.servicies.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categories = service.findAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findByID(@PathVariable Long id){
        Category obj = service.finByID(id);
        return ResponseEntity.ok().body(obj);
    }
}