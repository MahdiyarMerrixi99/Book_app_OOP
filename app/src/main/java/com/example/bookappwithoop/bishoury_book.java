package com.example.bookappwithoop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class bishoury_book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bishoury_book);


        AppCompatTextView bishourybookname=findViewById(R.id.bishoury_book_name);
        AppCompatTextView biobishoury=findViewById(R.id.bio_bishoury);

        BishouryBookClass bishouryBookClass=new BishouryBookClass();
        bishourybookname.setText(bishouryBookClass.getBOOKName());
        biobishoury.setText(bishouryBookClass.getBOOKBIO());
    }
}