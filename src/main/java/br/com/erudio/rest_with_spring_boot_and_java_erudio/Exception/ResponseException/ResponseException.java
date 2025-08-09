package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.ResponseException;

import java.time.LocalDateTime;

public class ResponseException {
    private String message;
    private int numberError;
    private LocalDateTime dateNow;
    private String httpTypeError;

    public ResponseException(String message, int numberError, LocalDateTime dateNow, String httpTypeError){
        this.message=message;
        this.numberError=numberError;
        this.dateNow=dateNow;
        this.httpTypeError=httpTypeError;
    }

    public String getMessage() {
        return message;
    }

    public int getNumberError() {
        return numberError;
    }

    public LocalDateTime getDateNow() {
        return dateNow;
    }

    public String getHttpTypeError() {
        return httpTypeError;
    }
}
