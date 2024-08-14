package com.studies.projetosbjpa.repositories;

import com.studies.projetosbjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
