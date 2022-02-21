package com.webmadria.workshopmongodb.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable{

    private static final long serialVersionUID = 1;

    private String id;
    private String name;
    private String email;

}
