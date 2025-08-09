package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.Handler;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.ResponseException.ResponseException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeExceptions.NotFoundResourcesException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice

public class ResponseNotFoundException {
    @ExceptionHandler(NotFoundResourcesException.class)
    public ResponseEntity<ResponseException> handlerExceptionNotFound(NotFoundResourcesException exception){

        HttpStatus httpStatus=HttpStatus.NOT_FOUND;
        ResponseException responseException=new ResponseException(exception.getMessage(),httpStatus.value(), LocalDateTime.now(),httpStatus.name());
        return new ResponseEntity<>(responseException,httpStatus);

    }

}


