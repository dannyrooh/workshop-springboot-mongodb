package com.webmadria.workshopmongodb.converters;

import com.webmadria.workshopmongodb.domain.User;
import com.webmadria.workshopmongodb.dtos.UserDTO;

public class UserConverter {

    public static UserDTO mapToDTO(User obj) {

        return new UserDTO(
            obj.getId(),
            obj.getName(),
            obj.getEmail()
        );
    }

    public static User mapToEntity(UserDTO obj) {
        return new User(
            obj.getId(),
            obj.getName(),
            obj.getEmail()
        );
    }
    
}
