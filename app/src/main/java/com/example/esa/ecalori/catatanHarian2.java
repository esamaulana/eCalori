package com.example.esa.ecalori;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class catatanHarian2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_harian2);

        Button aktiv0 = (Button) findViewById(R.id.aktiv0);
        aktiv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(catatanHarian2.this, catatanharian3.class);
                startActivity(i);
            }
    });
}
}
