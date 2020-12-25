package com.ma.MiniProje_OtoPark_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SonucEkrani extends AppCompatActivity {

    private TextView textViewSonucPlaka,textViewSonucUcret;
    private Button buttonArsivegit, buttonAnaEkranaGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_ekrani);

        textViewSonucPlaka = findViewById(R.id.textViewSonucPlaka);
        textViewSonucUcret = findViewById(R.id.textViewSonucUcret);

        buttonArsivegit = findViewById(R.id.buttonArsiveGit);
        buttonAnaEkranaGit = findViewById(R.id.buttonAnaEkranaGit);

        String plaka = getIntent().getStringExtra("plakalar");

        double ucret = getIntent().getDoubleExtra("ucrett",0);

        textViewSonucUcret.setText(String.valueOf(ucret));
        textViewSonucPlaka.setText(plaka);

        buttonArsivegit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SonucEkrani.this,ArsivEkrani.class));
                finish();
            }
        });

        buttonAnaEkranaGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SonucEkrani.this,MainActivity.class));
                finish();
            }
        });
    }
}