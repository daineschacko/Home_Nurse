package com.example.homenurse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class nures_bio extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    Spinner s1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nures_bio);
        ed1=findViewById(R.id.name_txt);
        ed2=findViewById(R.id.loc_u_wnt);
        ed3=findViewById(R.id.work_tim);
        ed4=findViewById(R.id.Salar_y);
        s1=findViewById(R.id.spinner_quli);
        btn1=findViewById(R.id.nurse_reg);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("")||ed2.getText().toString().equals("")||ed3.getText().toString().equals("")||ed4.getText().toString().equals("")){
                    Toast.makeText(nures_bio.this,"null field",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
