package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

@Service
//	Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class OrderService {
	
	  @Autowired 
    //para que a spring faça injeção de dependencia
   private OrderRepository repository;
   
    public List<Order> findAll(){
    	return repository.findAll();
    }
    
    public Order findById(Long id) {
    	Optional<Order> obj = repository.findById(id);
    	return obj.get();
    }
   
}
