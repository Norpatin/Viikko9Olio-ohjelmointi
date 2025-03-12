package com.example.viikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotePadListAdapter extends RecyclerView.Adapter<NoteViewHolder> {

    private Context context;
    private ArrayList<Note> notes = new ArrayList<>();

    public NotePadListAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }



    //public NotePadListAdapter(Context applicationContext, ArrayList<Note> rocets) {
    //}



    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.notepad_view, parent, false)); //Lisätty klo 17.53 11.3
        //return null; Oli aiemmin kun loi
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.NoteTitleText.setText(notes.get(position).getTitle());// + " (" + notes.get(position).getId() +")");
        holder.NoteContentText.setText(String.valueOf(notes.get(position).getContent()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
