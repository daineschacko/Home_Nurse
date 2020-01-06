package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class reg_patient extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5,ed6;
TextView tv1;

Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_patient);
        ed1=findViewById(R.id.name);
        ed2=findViewById(R.id.adress);
        ed3=findViewById(R.id.dob);
        ed4=findViewById(R.id.email);
        ed5=findViewById(R.id.pass1);
        ed6=findViewById(R.id.pass2);
        tv1=findViewById(R.id.back_home_nurse);
        btn1=findViewById(R.id.reg_btn2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(reg_patient.this,patient_home.class));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (ed1.getText().toString().equals("")||ed2.getText().toString().equals("")||ed3.getText().toString().equals("")||ed4.getText().toString().equals("")||ed5.getText().toString().equals("")||ed6.getText().toString().equals("")){
                    Toast.makeText(reg_patient.this,"fill the above",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
