package com.demo.jumia.exception;

public class InvalidException extends Exception{
    private static final long serialVersionUID = 1L;

    private String errorMessage;

    public InvalidException() {
        super();
    }

    public InvalidException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

