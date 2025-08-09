package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.Handler;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeExceptions.InvalidDataException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.ResponseException.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResponseHandlerInvalidData {
    @ExceptionHandler(InvalidDataException.class)
    public ResponseEntity<ResponseException> handlerInvalidDataException(InvalidDataException Exception){
        HttpStatus httpStatus=HttpStatus.BAD_REQUEST;
        ResponseException responseException=new ResponseException(Exception.getMessage(),httpStatus.value(), LocalDateTime.now(),httpStatus.name());
        return new ResponseEntity<>(responseException,httpStatus);

    }
}
