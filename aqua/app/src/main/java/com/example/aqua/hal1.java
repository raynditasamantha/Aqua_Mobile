package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class hal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hal1);
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
        ;
        NavigationView navigationView = findViewById(R.id.nav_menu);

        navigationView.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.logout) {
                // Buka halaman pertama jika item menu 1 diklik
                Intent intent1 = new Intent(hal1.this, login.class);
                startActivity(intent1);
            }

            drawerLayout.closeDrawers();
            return true;

        });

    }

    public void burgerr(View view) {
        DrawerLayout drawerLayout = findViewById(R.id.driver_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END);
        } else {
            drawerLayout.openDrawer(GravityCompat.END);
        }

    }

    public void scanner(View v) {
        Intent intent = new Intent(hal1.this, scan.class);
        startActivity(intent);
    }

    public void extra(View v) {
        Intent intent = new Intent(hal1.this, spin.class);
        startActivity(intent);
    }
}