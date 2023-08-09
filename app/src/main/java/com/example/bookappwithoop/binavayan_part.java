package com.example.bookappwithoop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

import com.example.bookappwithoop.databinding.ActivityBinavayanPartBinding;

public class binavayan_part extends AppCompatActivity {

    private ActivityBinavayanPartBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBinavayanPartBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_binavayan_part);

        AppCompatTextView bookname=findViewById(R.id.book_name);
        AppCompatTextView bookbio=findViewById(R.id.bio);
        Book book=new Book();
        book.setBOOKName("Binavayan");
        bookname.setText(book.getBOOKName());

        book.setBOOKBIO(getString(R.string.Binavayan_Bio));
        bookbio.setText(book.getBOOKBIO());



    }
}