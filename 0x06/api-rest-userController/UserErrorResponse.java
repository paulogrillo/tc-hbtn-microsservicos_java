package com.example.user.exception;


public class UserErrorResponse {

    int status;
    String message;

    public UserErrorResponse() {

    }

    public UserErrorResponse(int status, String message1) {
        this.status = status;
        this.message = message1;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}