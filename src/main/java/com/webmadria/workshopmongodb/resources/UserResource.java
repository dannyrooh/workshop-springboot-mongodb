package com.webmadria.workshopmongodb.resources;

import java.net.URI;
import java.util.List;

import com.webmadria.workshopmongodb.converters.UserConverter;
import com.webmadria.workshopmongodb.domain.User;
import com.webmadria.workshopmongodb.dtos.UserDTO;
import com.webmadria.workshopmongodb.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


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

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {

        User obj = this.service.findById(id);
        return ResponseEntity.ok().body( UserConverter.mapToDTO(obj) );
    }
    
    @PostMapping()
    public ResponseEntity<Void> insert(@RequestBody UserDTO objDTO) {

        User obj = service.insert( UserConverter.mapToEntity(objDTO) );

        URI uri = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(obj.getId())
            .toUri();

         return ResponseEntity.created(uri).build();
    }

}
