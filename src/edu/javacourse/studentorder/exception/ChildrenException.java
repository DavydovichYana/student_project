package edu.javacourse.studentorder.exception;

public class ChildrenException extends Exception {
    public ChildrenException() {
    }

    public ChildrenException(String message) {
        super(message);
    }

    public ChildrenException(String message, Throwable cause) {
        super(message, cause);
    }
}
