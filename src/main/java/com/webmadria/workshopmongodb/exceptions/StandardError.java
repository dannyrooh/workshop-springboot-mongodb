package com.webmadria.workshopmongodb.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardError implements Serializable{

    private static final long serialVersionUID = 1;

    private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}
