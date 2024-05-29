package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class red extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_red);
    }

    public void submit(View v) {
        Intent intent = new Intent(red.this, green.class);
        startActivity(intent);
    }

    public void cancel(View v) {
        Intent intent = new Intent (red.this, hal1.class);
        startActivity(intent);}

}
