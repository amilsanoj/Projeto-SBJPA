package com.studies.projetosbjpa.repositories;

import com.studies.projetosbjpa.entities.OrderItem;
import com.studies.projetosbjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
