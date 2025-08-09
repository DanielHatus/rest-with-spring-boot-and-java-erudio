package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeExceptions;

public class NotFoundResourcesException extends RuntimeException {
    public NotFoundResourcesException(String message){
        super(message);
    }
}
