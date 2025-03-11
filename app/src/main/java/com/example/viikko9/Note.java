package com.example.viikko9;

public class Note {
    private String title;
    private String content;

    private int Id;
    private String timeAndDate;

    public Note() {
        this.title = title;
        this.content = content;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void add(Note notes) {
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return Id;
    }

    public String getContent() {
        return content;
    }
}

