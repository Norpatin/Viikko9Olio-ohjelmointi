package com.example.viikko9;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class NoteStorage {
    private ArrayList<Note> notes = new ArrayList<>();
    private static NoteStorage noteStorage = null;

    public NoteStorage(){}

    public static NoteStorage getInstance() {
        if(noteStorage == null) {
            noteStorage = new NoteStorage();
        }
        return noteStorage;
    }

    public ArrayList<Note> getRockets() {
        return notes;
    }

    public void addRocket(Note notes) {
        notes.add(notes);
    }




}
