package com.example.sungansungan12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class UploadActivity extends AppCompatActivity {
    ImageButton home;
    AppCompatButton uploadPOST;
    EditText productName,productDescription,productPrice,productAvailable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        home = findViewById(R.id.homeButton);
        uploadPOST = findViewById(R.id.uplodePOSTBt);

        productName = findViewById(R.id.productName);
        productDescription=findViewById(R.id.productDescription);
        productPrice=findViewById(R.id.productPrice);
        productAvailable=findViewById(R.id.productAvailable);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });


        uploadPOST.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });


    }
}