package com.example.esa.ecalori;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class KalkulatorIMT extends AppCompatActivity {
    private EditText berat;
    private EditText tinggi;
    private Button mButton;
    private double imt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_imt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        berat = (EditText) findViewById(R.id.beratBadan);
        tinggi = (EditText) findViewById(R.id.tinggiBadan);
        mButton = (Button) findViewById(R.id.buttonHitung);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
            }
        });
    }

    public void hitung(){
        if (TextUtils.isEmpty(berat.getText())) {
            tampil("Peringatan", "Anda belum mengisi berat badan anda");
        } else if (TextUtils.isEmpty(tinggi.getText())) {
            tampil("Peringatan", "Anda belum mengisi tinggi badan anda");
        } else {
            double b = Double.valueOf(berat.getText().toString());
            double t = (Double.valueOf(tinggi.getText().toString())/100);
            imt = (b / (t * t));
            IMT(imt);
        }
    }

    public void IMT(double imt) {
        DecimalFormat f = new DecimalFormat("##.00");
        if (imt < 18.4) {
            tampil("Berat Masa Index", "IMT Anda : " + f.format(imt)
                    + "\nAnda termasuk Kategori : Kurus");
        } else if (imt > 18.5 && imt < 24.9) {
            tampil("Berat Masa Index", "IMT Anda : " + f.format(imt)
                    + "\nAnda termasuk Kategori : Ideal");
        } else if (imt > 25 && imt < 29.9) {
            tampil("Berat Masa Index", "IMT Anda : " + f.format(imt)
                    + "\nAnda termasuk Kategori : Berlebihan");
        } else if (imt > 30 && imt < 39.9) {
            tampil("Berat Masa Index", "IMT Anda : " + f.format(imt)
                    + "\nAnda termasuk Kategori : Gemuk");
        } else {
            tampil("Berat Masa Index", "IMT Anda : " + f.format(imt)
                    + "\nAnda termasuk Kategori : Obesitas");

        }
    }

    public void tampil(final String x, final String xx) {
        AlertDialog.Builder builder = new AlertDialog.Builder(KalkulatorIMT.this);
        builder.setCancelable(true)
                .setTitle(x)
                .setMessage(xx);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }


}
