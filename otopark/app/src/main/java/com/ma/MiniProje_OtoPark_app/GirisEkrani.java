package com.ma.MiniProje_OtoPark_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GirisEkrani extends AppCompatActivity {

    private TextView textViewPlaka, textViewSaat;
    private Button buttonKaydet, buttonIptal;
    private VeriTabaniOlustur vto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_ekrani);

        textViewPlaka = findViewById(R.id.textViewPlaka);
        textViewSaat = findViewById(R.id.textViewSaat);
        buttonKaydet = findViewById(R.id.buttonKaydet);
        buttonIptal = findViewById(R.id.buttonIptal);


        vto = new VeriTabaniOlustur(this);


        final String plaka = getIntent().getStringExtra("plaka");
        final int girisSaati = getIntent().getIntExtra("girisSaati",0);
        final int girisDakikasi = getIntent().getIntExtra("girisDakikasi",0);
        final String yazilacakGirisSaat = girisSaati + ":" + girisDakikasi;
        textViewPlaka.setText(plaka);
        textViewSaat.setText(yazilacakGirisSaat);






        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String defaltUcret = "10";
                final String yazilacakCikisSaati = "cikis yapilmadi";
                new VeriTabaniMetodlar().ekle(vto,plaka,yazilacakGirisSaat);
                startActivity(new Intent(GirisEkrani.this,MainActivity.class));
                finish();


            }
        });

        buttonIptal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GirisEkrani.this,MainActivity.class));
                finish();
            }
        });




    }
}