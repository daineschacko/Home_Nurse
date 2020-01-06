package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText uname,pass;
    TextView fgtpass;
    Button bth1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.et_enter_email);
        pass=findViewById(R.id.et_enter_pass);
        fgtpass=findViewById(R.id.fpass);
        fgtpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,forgt_pass.class));
            }
        });
        bth1=findViewById(R.id.bt_sign_in);
        btn2=findViewById(R.id.bt_sign_up);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,reg.class));
            }
        });
        bth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uname.getText().toString().equals("nurse")&&pass.getText().toString().equals("123")){
                    startActivity(new Intent(MainActivity.this,nures_home.class));
                }
            if (uname.getText().toString().equals("user")&&pass.getText().toString().equals("user")){
                startActivity(new Intent(MainActivity.this,patient_home.class));
            }
            else {
                Toast.makeText(MainActivity.this,"invalid username or passeord",Toast.LENGTH_LONG).show();
            }
            }

        });
    }
}
