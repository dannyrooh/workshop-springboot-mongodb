package com.webmadria.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import com.webmadria.workshopmongodb.domain.User;
import com.webmadria.workshopmongodb.exceptions.ObjectNotFoundException;
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

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow( () -> new ObjectNotFoundException("Usuário não encontrado") );
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        this.findById(id);
        repo.deleteById(id);
    }

    public User update(User user) {
        User newObj = this.findById(user.getId());
        
        newObj.setName(user.getName());
        newObj.setEmail(user.getEmail());

        repo.save(newObj);

        return newObj;

    }
}
