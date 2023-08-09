package com.example.bookappwithoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bookappwithoop.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.binavayanBook.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,binavayan_part.class);
            startActivity(intent);
        });
        binding.boyMuseHorseBook.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity.this,boybook.class);
            startActivity(intent1);
        });
        binding.BishouryBookPart.setOnClickListener(view -> {
            Intent intent2 = new Intent(MainActivity.this,bishoury_book.class);
            startActivity(intent2);
        });
        binding.HafezBook.setOnClickListener(view -> {
            Intent intent3 = new Intent(MainActivity.this,Hafez_Poems.class);
            startActivity(intent3);
        });
    }
}