package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgt_pass extends AppCompatActivity {
    EditText fpassword;
    Button btnfp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgt_pass);
        fpassword=findViewById(R.id.fgt_pass);
        btnfp=findViewById(R.id.fgt_btn);
        btnfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fpassword.getText().toString().equals(""))
                    Toast.makeText(forgt_pass.this, "Enter your phone Number", Toast.LENGTH_LONG).show();
            }

        });
    }
}
