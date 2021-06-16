package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginpage extends AppCompatActivity {
    Button b3;
    EditText etpid;
    String pid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        etpid=findViewById(R.id.etpid);
        b3=findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                pid=etpid.getText().toString();
                startActivity(new Intent(loginpage.this,home.class));
                if(pid=="12345"){
                    startActivity(new Intent(loginpage.this,home.class));
                    Toast.makeText(loginpage.this,"login success",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(loginpage.this,"login success",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}