package com.webmadria.workshopmongodb.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    
    private static final long serialVersionUID = 1;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    
}
