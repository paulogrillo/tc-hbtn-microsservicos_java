package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {
    @ExceptionHandler(CPFException.class)
    ResponseEntity<CPFException> handleException(CPFException err) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered CPF " + err.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(UserIdException.class)
    ResponseEntity<UserIdException> handleException(UserIdException idE) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered invalid ID " + idE.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNameException.class)
    ResponseEntity<UserNameException> handleException(UserNameException name) {
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered invalid USERNAME " + name.getMessage() + " invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }
}