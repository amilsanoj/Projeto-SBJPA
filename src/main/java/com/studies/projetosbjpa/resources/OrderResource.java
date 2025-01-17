package com.studies.projetosbjpa.resources;

import com.studies.projetosbjpa.entities.Order;
import com.studies.projetosbjpa.entities.User;
import com.studies.projetosbjpa.repositories.OrderRepository;
import com.studies.projetosbjpa.servicies.OrderService;
import com.studies.projetosbjpa.servicies.UserService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> orderList = service.findAll();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findByID(@PathVariable Long id){
        Order obj = service.finByID(id);
        return ResponseEntity.ok().body(obj);
    }
}
