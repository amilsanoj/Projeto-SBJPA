package com.studies.projetosbjpa.servicies;

import com.studies.projetosbjpa.entities.User;
import com.studies.projetosbjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User finByID(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }

}
