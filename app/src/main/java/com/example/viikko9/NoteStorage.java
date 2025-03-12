package com.example.viikko9;

import java.util.ArrayList;

public class NoteStorage {
    private ArrayList<Note> notes = new ArrayList<>();
    private static NoteStorage noteStorage = null;

    public NoteStorage(){

    }

    public static NoteStorage getInstance() {
        if(noteStorage == null) {
            noteStorage = new NoteStorage();
        }
        return noteStorage;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    /*public Note getNoteById(int id) {
        return notes.remove(id);
    }
    /**/

    public void addNote(Note note) {
        notes.add(note);
    }
}
