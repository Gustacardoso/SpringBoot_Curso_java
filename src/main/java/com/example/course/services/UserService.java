package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Service
//	Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class UserService {
	
	  @Autowired 
    //para que a spring faça injeção de dependencia
   private UserRepository repository;
   
    public List<User> findAll(){
    	return repository.findAll();
    }
    
    public User findById(Long id) {
    	Optional<User> obj = repository.findById(id);
    	return obj.get();
    }
   
}
