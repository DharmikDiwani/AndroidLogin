package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    plainText txtId;
    EditText txtId;
    EditText txtPass;
    Button reset;
    TextView signUp;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
            // References 
            txtId = findViewById(R.id.txtId);
            txtPass = findViewById(R.id.txtPass);
            reset = findViewById(R.id.reset);
            signUp = findViewById(R.id.signUp);
            
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtId.setText("");
                    txtPass.setText("");
                    Toast.makeText(MainActivity.this, "Reset successfully...", Toast.LENGTH_SHORT).show();
                }
            });
            
            signUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Opening...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                }
            });

    }
}