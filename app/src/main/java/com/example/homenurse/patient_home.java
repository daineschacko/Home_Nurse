package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class patient_home extends AppCompatActivity {
    TextView appln,view_req,l_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_home);
        appln=findViewById(R.id.patient_appl);
        appln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patient_home.this,reg_patient.class));
            }
        });
        l_out=findViewById(R.id.sin_out);
        l_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patient_home.this,MainActivity.class));
            }
        });
        view_req=findViewById(R.id.req_view);
        view_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patient_home.this,view_patient_req.class));
            }
        });
    }
}
