package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeResponseException;

public class NotFoundResourceException extends RuntimeException {
   public NotFoundResourceException(String message){super(message);}
}
