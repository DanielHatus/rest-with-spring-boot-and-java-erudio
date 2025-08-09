package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception.TypeExceptions;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message)
    {
        super(message);
    }
}
