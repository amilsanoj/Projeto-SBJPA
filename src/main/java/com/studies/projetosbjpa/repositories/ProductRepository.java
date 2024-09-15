package com.studies.projetosbjpa.repositories;

import com.studies.projetosbjpa.entities.Category;
import com.studies.projetosbjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
