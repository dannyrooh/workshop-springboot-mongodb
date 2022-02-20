package com.webmadria.workshopmongodb.services;

import java.util.List;

import com.webmadria.workshopmongodb.domain.User;
import com.webmadria.workshopmongodb.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    
    public List<User> findAll(){
        return this.repo.findAll();
    }
}
