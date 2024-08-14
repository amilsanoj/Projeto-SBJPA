package com.studies.projetosbjpa.servicies;

import com.studies.projetosbjpa.entities.Order;
import com.studies.projetosbjpa.entities.User;
import com.studies.projetosbjpa.repositories.OrderRepository;
import com.studies.projetosbjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order finByID(Long id){
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }

}
