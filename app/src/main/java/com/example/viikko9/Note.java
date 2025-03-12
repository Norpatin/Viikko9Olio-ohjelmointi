package com.example.viikko9;

public class Note {
    protected String title;
    protected String content;
    public static int Id = 0;
    protected String timeAndDate;

    public Note() {
        this.title = title;
        this.content = content;
        this.Id = Id;
        this.timeAndDate = timeAndDate;
    }

    public Note(String title, String content){
        this.title = title;
        this.content = content;
        Id++;
    }

    public void add(Note notes) {
        //NoteStorage.addNote(notes);
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

