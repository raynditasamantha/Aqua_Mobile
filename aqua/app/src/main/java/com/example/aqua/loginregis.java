package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class loginregis extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginregis);
    }

    public void loginn(View v){
        Intent intent = new Intent (loginregis.this, login.class);
        startActivity(intent);
    }

    public void regis(View v){
        Intent intent = new Intent(loginregis.this, register.class);
        startActivity(intent);
    }

}