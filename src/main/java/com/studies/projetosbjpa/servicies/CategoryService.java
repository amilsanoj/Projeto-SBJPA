package com.studies.projetosbjpa.servicies;

import com.studies.projetosbjpa.entities.Category;
import com.studies.projetosbjpa.entities.User;
import com.studies.projetosbjpa.repositories.CategoryRepository;
import com.studies.projetosbjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category finByID(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
