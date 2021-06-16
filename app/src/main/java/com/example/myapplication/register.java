package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    Button b4;
    EditText etn,etma;
    String n,ma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etn=findViewById(R.id.etn);
        etma=findViewById(R.id.etma);
        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n=etn.getText().toString();
                ma=etma.getText().toString();
                Toast.makeText(register.this,"ID SENT TO EMAIL",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(register.this, loginpage.class));
            }

        });
    }
}