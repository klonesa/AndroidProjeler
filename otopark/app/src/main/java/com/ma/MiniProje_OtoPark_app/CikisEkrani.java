package com.ma.MiniProje_OtoPark_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CikisEkrani extends AppCompatActivity {

    private TextView textViewPlaka,textViewGirisSaati,textViewCikisSaati,textViewUcret;
    private Button buttonCikisYap,buttonArsiveGit;
    private double saatlikUcret = 10;
    private VeriTabaniOlustur vto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cikis_ekrani);

        textViewPlaka = findViewById(R.id.textViewPlaka);
        textViewGirisSaati = findViewById(R.id.textViewGirisSaati);
        textViewCikisSaati = findViewById(R.id.textViewCikisSaati);
        textViewUcret = findViewById(R.id.textViewUcret);
        buttonCikisYap = findViewById(R.id.buttonCikisYap);
        buttonArsiveGit = findViewById(R.id.buttonArsiveGit);
        vto = new VeriTabaniOlustur(this);

        final String plaka = getIntent().getStringExtra("plaka");
        final int id = getIntent().getIntExtra("id",0);

        final int cikisSaati = getIntent().getIntExtra("cikisSaati",0);
        final int cikisDakikasi = getIntent().getIntExtra("cikisDakikasi",0);
        final String yazilacakCikisSaati = cikisSaati + ":"+cikisDakikasi;

        String girisSaati = getIntent().getStringExtra("girisSaati");
        double girisinSaati =Double.valueOf( girisSaati.replace(':','.'));

        int girisSaat = (int)girisinSaati;
        int grs = (int)(girisinSaati*100);
        final int girisDakika =grs % 100;

        int dakika1 = (60 - girisDakika);
        girisSaat = girisSaat +1;
        girisSaat = cikisSaati - girisSaat;
        int dakika2 = dakika1 + cikisDakikasi;
        if(dakika2 > 60){
            dakika2 = dakika2 % 60;
            girisSaat = girisSaat +1;
        }


        double gecenSureDakika = (girisSaat * 60) + dakika2;


        final double dakikalikUcret = (double)10 / 60;

        final double gercekUcret = (double)((int)(dakikalikUcret *100))/100;// bu işleme alınacak



        final double ucret =(double) (gecenSureDakika * gercekUcret);


        textViewPlaka.setText(plaka);
        textViewGirisSaati.setText(girisSaati);
        textViewCikisSaati.setText(yazilacakCikisSaati);
        textViewUcret.setText(String.valueOf(ucret + " TL"));







        buttonCikisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               new VeriTabaniMetodlar().sil(vto,id);

               Intent intent = new Intent(CikisEkrani.this,SonucEkrani.class);
               intent.putExtra("plakalar",plaka);
               intent.putExtra("ucrett",ucret);
               startActivity(intent);
               finish();

            }
        });

        buttonArsiveGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CikisEkrani.this,ArsivEkrani.class));
                finish();
                //Toast.makeText(CikisEkrani.this, "gecenSureDakika:"+String.valueOf(gecenSureDakika), Toast.LENGTH_SHORT).show();

            }
        });

    }
}