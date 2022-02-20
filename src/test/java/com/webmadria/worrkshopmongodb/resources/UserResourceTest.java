package com.webmadria.worrkshopmongodb.resources;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.webmadria.workshopmongodb.domain.User;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class UserResourceTest {


    private List<User> users(){
        User maria = new User("1","Maria","maria@joao.com.br");
        User joao = new User("2","Joao","joao@maria.com.br");
        List<User> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(maria,joao));
        return lista;
    }

    @Test
    public ResponseEntity<List<User>> findAll() {
        List<User> lista = this.users();
        return ResponseEntity.ok().body(lista);
    }
    
}
