package edu.javacourse.studentorder.exception;

public class WeddingException extends Exception {
    public WeddingException() {}

    public WeddingException(String message) {
        super(message);
    }

    public WeddingException(String message, Throwable cause) {
        super(message, cause);
    }
}
