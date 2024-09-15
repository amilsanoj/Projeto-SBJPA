package com.studies.projetosbjpa.repositories;

import com.studies.projetosbjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
