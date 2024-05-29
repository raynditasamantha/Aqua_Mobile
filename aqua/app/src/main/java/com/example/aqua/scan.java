package com.example.aqua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class scan extends AppCompatActivity {

    private ImageButton camera;
    private ActivityResultLauncher<Intent> scanBarcodeLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        camera = findViewById(R.id.camera);

        // Inisialisasi scanBarcodeLauncher
        scanBarcodeLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK) {
                        Intent nextIntent = new Intent(scan.this, qr.class);
                        startActivity(nextIntent);
                    }
                });

        // Set OnClickListener untuk camera
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Memulai ScanActivity dan menunggu hasilnya
                Intent intent = new Intent(scan.this, qr.class);
                scanBarcodeLauncher.launch(intent);
            }
        });
    }
    public void cancel(View v) {
        Intent intent = new Intent (scan.this, hal1.class);
        startActivity(intent);}

}

