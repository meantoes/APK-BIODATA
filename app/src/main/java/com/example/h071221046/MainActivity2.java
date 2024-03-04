package com.example.h071221046;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private TextView nama, nim, nomor;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        nomor = findViewById(R.id.nomor);

        String nama = getIntent().getStringExtra("keyname");
        String nim = getIntent().getStringExtra("nim");
        String nomor = getIntent().getStringExtra("nomor");

    }
}
