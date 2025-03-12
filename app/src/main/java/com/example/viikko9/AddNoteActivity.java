package com.example.viikko9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.interfaces.EdECKey;

public class AddNoteActivity extends AppCompatActivity {

    private EditText title;
    private EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        title = findViewById(R.id.TitleEdit);
        content = findViewById(R.id.ContentEdit);
    }

    //public void addNotepad(View view) {

    //title = findViewById(R.id.TitleEdit);
    //content = findViewById(R.id.ContentEdit);
    //this.title = title; ???
    //this.content = content; ???
    //}

    public void addNote(View view) {
        //EditText EtxtTitle = findViewById(R.id.TitleEdit);
        //EditText EtxtContent = findViewById(R.id.ContentEdit);
        String titleS = title.getText().toString();
        String contentS = content.getText().toString();
        NoteStorage.getInstance().addNote(new Note(titleS, contentS));
        //NoteStorage.getInstance().addNote(new (EtxtTitle, EtxtContent));
        //Testi testi = new Testi(EtxtTitle, EtxtContent);
        //***String StringTitle = EtxtTitle.getText().toString();
        //***String StringContent = EtxtContent.getText().toString();
        //***Note note = new Note(StringTitle, StringContent);
        //note.add(note);
        //NoteStorage.getInstance().addNote(note);
        //title = findViewById(R.id.NoteTitleText);
        //content1 = findViewById(R.id.NoteContentText);
        //TextView rgRocketType = findViewById(R.id.NoteIdText);
        //    NoteStorage.getInstance().addNote(new Note());
    }

    public void SwitchMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}