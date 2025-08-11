package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.Handler;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.ResponseException.ResponseException;
import br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeResponseException.NotFoundResourceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class HandlerResponseEntityException {
    @ExceptionHandler(NotFoundResourceException.class)

    public ResponseEntity<ResponseException> handlerResponse(NotFoundResourceException exception){
        HttpStatus httpStatus=HttpStatus.NOT_FOUND;
        ResponseException responseException=new ResponseException(exception.getMessage(), LocalDateTime.now(),httpStatus.name(),httpStatus.value());
        return new ResponseEntity<ResponseException>(responseException,httpStatus);
    }
}
