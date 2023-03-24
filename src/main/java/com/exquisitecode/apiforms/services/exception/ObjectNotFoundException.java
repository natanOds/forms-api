package com.exquisitecode.apiforms.services.exception;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 3560879013170438820L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

}
