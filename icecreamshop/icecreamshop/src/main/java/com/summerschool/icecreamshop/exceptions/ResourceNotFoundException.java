package com.summerschool.icecreamshop.exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(String message) {
        super(message);
    }
}
