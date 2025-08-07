package br.com.erudio.rest_with_spring_boot_and_java_erudio.Exception;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message)
    {
        super(message);
    }
}
