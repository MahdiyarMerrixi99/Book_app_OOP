package com.example.bookappwithoop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class boybook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boybook);

        AppCompatTextView bookboyname=findViewById(R.id.boy_book_name);
        AppCompatTextView bioboy=findViewById(R.id.bio_boy);

        BoyBookClass boyBookClass=new BoyBookClass();
        bookboyname.setText(boyBookClass.getBOOKName());
        bioboy.setText(boyBookClass.getBOOKBIO());
    }
}