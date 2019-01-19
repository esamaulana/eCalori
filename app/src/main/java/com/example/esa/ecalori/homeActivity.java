package com.example.esa.ecalori;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton cariMakanan = (ImageButton) findViewById(R.id.cariMakanan);
        cariMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cariMakanan = new Intent(homeActivity.this, cariMakanan.class);
                startActivity(cariMakanan);
            }
        });

        ImageButton KalkulatorIMT = (ImageButton) findViewById(R.id.KalkulatorIMT);
        KalkulatorIMT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent KalkulatorIMT = new Intent(homeActivity.this, KalkulatorIMT.class);
                startActivity(KalkulatorIMT);
            }
        });

        ImageButton catatanHarian = (ImageButton) findViewById(R.id.catatanHarian);
        catatanHarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catatanHarian = new Intent(homeActivity.this, catatanHarian.class);
                startActivity(catatanHarian);
            }
        });

        ImageButton beritaKesehatan = (ImageButton) findViewById(R.id.beritaKesehatan);
        beritaKesehatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent beritaKesehatan = new Intent(homeActivity.this, beritaKesehatan.class);
                startActivity(beritaKesehatan);
            }
        });

        ImageButton about = (ImageButton) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(homeActivity.this, about.class);
                startActivity(about);
            }
        });

        ImageButton feedback = (ImageButton) findViewById(R.id.feedbacks);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feedback = new Intent(Intent.ACTION_VIEW);
                feedback.setData(Uri.parse("https://www.fatsecret.com"));
                startActivity(feedback);
            }
        });
    }
}
