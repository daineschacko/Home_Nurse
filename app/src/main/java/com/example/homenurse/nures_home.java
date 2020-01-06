package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nures_home extends AppCompatActivity {
    TextView req,regn,s_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nures_home);
        req=findViewById(R.id.Req);
        req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nures_home.this,requ_est.class));
            }
        });
        regn=findViewById(R.id.bio_text);
        regn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nures_home.this,nures_bio.class));
            }
        });
        s_out=findViewById(R.id.sin_out);
        s_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nures_home.this,MainActivity.class ));
            }
        });
    }
}
