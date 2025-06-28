package com.example.email;

public class Email {
    private String subject;
    private String message;

    public Email(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() { return subject; }
    public String getMessage() { return message; }
}
