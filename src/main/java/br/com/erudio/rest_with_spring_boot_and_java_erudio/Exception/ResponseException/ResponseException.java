package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.ResponseException;

import java.time.LocalDateTime;
import java.util.Objects;

public class ResponseException {
    private String message;
    private LocalDateTime localDateTime;
    private String typeHttpErrorMessage;
    private int numberHttpEror;

    public ResponseException(String message,LocalDateTime localDateTime,String typeHttpErrorMessage,int numberHttpError){
        this.message=message;
        this.localDateTime=localDateTime;
        this.typeHttpErrorMessage=typeHttpErrorMessage;
        this.numberHttpEror=numberHttpError;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getTypeHttpErrorMessage() {
        return typeHttpErrorMessage;
    }

    public int getNumberHttpEror() {
        return numberHttpEror;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ResponseException that)) return false;
        return getNumberHttpEror() == that.getNumberHttpEror() && Objects.equals(getMessage(), that.getMessage()) && Objects.equals(getLocalDateTime(), that.getLocalDateTime()) && Objects.equals(getTypeHttpErrorMessage(), that.getTypeHttpErrorMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getLocalDateTime(), getTypeHttpErrorMessage(), getNumberHttpEror());
    }
}
