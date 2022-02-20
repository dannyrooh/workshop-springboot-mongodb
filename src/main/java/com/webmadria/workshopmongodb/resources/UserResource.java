package com.webmadria.workshopmongodb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webmadria.workshopmongodb.domain.User;
import com.webmadria.workshopmongodb.services.UserService;

import java.lang.reflect.Constructor;
import java.util.List;


@RestController
@RequestMapping(value="/users")
public class UserResource {

    @Autowired
    private UserService service;
    
    @GetMapping()
    public ResponseEntity<List<User>> findAll() {

        List<User> lista = this.service.findAll();
        return ResponseEntity.ok().body(lista);
    }
    
}
