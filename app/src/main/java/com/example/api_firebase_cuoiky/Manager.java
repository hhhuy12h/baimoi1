package com.example.api_firebase_cuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Manager extends AppCompatActivity {
    Button btnShowInfo,btnaddEploy;
    Button btnLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_manager );
        setContentView(R.layout.activity_manager);
        btnaddEploy = findViewById(R.id.btnaddel);
        btnLogout = findViewById(R.id.btnLogout);
        btnShowInfo = findViewById(R.id.btnshowinfo);

        btnLogout.setOnClickListener(view->{
            startActivity(new Intent( Manager.this,MainActivity.class));
        });
        btnShowInfo.setOnClickListener(view->{
            startActivity(new Intent(Manager.this,ShowInfo.class));
        });
        btnaddEploy.setOnClickListener(view->{
            startActivity(new Intent(Manager.this,AddEmployee.class));
        });
    }
}