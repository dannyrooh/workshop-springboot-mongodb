package com.webmadria.workshopmongodb.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class User implements Serializable{
    
    @Id
    private String id;
    private String name;
    private String email;
}
