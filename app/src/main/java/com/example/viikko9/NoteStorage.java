package com.example.viikko9;

import java.util.ArrayList;

public class NoteStorage {
    private ArrayList<Note> notes = new ArrayList<>();
    private static NoteStorage noteStorage = null;

    public NoteStorage(){
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public Note getNoteById(int id){  //Lisätty 12.3 klo.15.23
        return notes.remove(id);
    }

    public void listNotes() { //Lisätty 12.3 klo.15.25
        int i = 0;
        for (Note bite : notes) {
            //System.out.println(i++ ":" + getNoteById().getTitle());
        }
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
}
