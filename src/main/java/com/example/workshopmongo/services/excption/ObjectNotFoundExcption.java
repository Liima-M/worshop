package com.example.workshopmongo.services.excption;

public class ObjectNotFoundExcption extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundExcption(String msg){
        super(msg);
    }
}
