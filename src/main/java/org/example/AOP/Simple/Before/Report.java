package org.example.AOP.Simple.Before;

public class Report {
    private String message;
    private String author;

    public Report(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }

}
