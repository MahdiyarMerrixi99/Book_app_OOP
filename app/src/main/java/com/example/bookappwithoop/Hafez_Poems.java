package com.example.bookappwithoop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class Hafez_Poems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafez_poems);

        AppCompatTextView Hafez_book_name=findViewById(R.id.Hafez_book_name);
        AppCompatTextView Hafez_book_bio=findViewById(R.id.Hafez_book_bio);

        HafezBookClass hafezBookClass=new HafezBookClass();
        Hafez_book_name.setText(hafezBookClass.getBOOKName());
        Hafez_book_bio.setText(hafezBookClass.getBOOKBIO());
    }
}