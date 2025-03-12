package com.example.viikko9;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder{
    TextView NoteTitleText, NoteContentText;//, NoteIdText, NoteTimeAndDateText;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        NoteTitleText = itemView.findViewById(R.id.NoteTitleText);
        NoteContentText = itemView.findViewById(R.id.NoteContentText);
        //NoteIdText = itemView.findViewById(R.id.NoteIdText);
        //NoteTimeAndDateText = itemView.findViewById(R.id.NoteTimeAndDateText);
    }
}
