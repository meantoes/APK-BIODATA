package com.example.h071221046;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    private EditText inputNama, inputNim, inputNomor;
//    private Button saveButton;
//
//    @Override
//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        inputNama = findViewById(R.id.inputNama);
//        inputNim = findViewById(R.id.inputNim);
//        inputNomor = findViewById(R.id.inputNomor);
//        saveButton = findViewById(R.id.saveButton);
//
//        saveButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String name = inputNama.getText().toString();
//                String nim = inputNim.getText().toString();
//                String nomor = inputNomor.getText().toString();
//
//                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                intent.putExtra("keyname", name);
//                intent.putExtra("nim", nim);
//                intent.putExtra("nomor", nomor);
//
//                startActivity(intent);
//            }
//        });
}