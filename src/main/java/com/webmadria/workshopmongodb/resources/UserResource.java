package com.webmadria.workshopmongodb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.webmadria.workshopmongodb.domain.User;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {

        User maria = new User("1","Maria","maria@joao.com.br");
        User joao = new User("2","Joao","joao@maria.com.br");
        List<User> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(maria,joao));
       
        return ResponseEntity.ok().body(lista);
    }
    
}
