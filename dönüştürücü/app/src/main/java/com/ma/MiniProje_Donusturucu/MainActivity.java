package com.ma.MiniProje_Donusturucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button buttonUzunluk,buttonAgirlik,buttonSicaklik,buttonAlan,buttonHiz,buttonZaman;
    private ArrayList<String> uzunlukListe,agirlikListe,sicaklikListe,alanListe,hizListe,zamanListe;
    private String bildirim = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUzunluk = findViewById(R.id.buttonUzunluk);
        buttonAgirlik = findViewById(R.id.buttonAgirlik);
        buttonSicaklik = findViewById(R.id.buttonSicaklik);
        buttonAlan = findViewById(R.id.buttonAlan);
        buttonHiz = findViewById(R.id.buttonHiz);
        buttonZaman = findViewById(R.id.buttonZaman);


        uzunlukListe = new ArrayList<>();
        uzunlukListe.add("MiliMetre");
        uzunlukListe.add("SantiMetre");
        uzunlukListe.add("Metre");
        uzunlukListe.add("KiloMetre");


        agirlikListe = new ArrayList<>();
        agirlikListe.add("MiliGram");
        agirlikListe.add("SantiGram");
        agirlikListe.add("DesiGram");
        agirlikListe.add("Gram");
        agirlikListe.add("DekaGram");
        agirlikListe.add("HektoGram");
        agirlikListe.add("KiloGram");

        sicaklikListe = new ArrayList<>();
        sicaklikListe.add("Celsius");
        sicaklikListe.add("Fahrenheit");
        sicaklikListe.add("Kelvin");

        alanListe = new ArrayList<>();
        alanListe.add("MiliMetreKare");
        alanListe.add("SantiMetreKare");
        alanListe.add("MetreKare");
        alanListe.add("Hektar");
        alanListe.add("KiloMetreKare");

        hizListe = new ArrayList<>();
        hizListe.add("SantiMetre/Saniye");
        hizListe.add("Metre/Saniye");
        hizListe.add("KiloMetre/Saat");

        zamanListe = new ArrayList<>();
        zamanListe.add("MiliSaniye");
        zamanListe.add("Saniye");
        zamanListe.add("Dakika");
        zamanListe.add("Saat");
        zamanListe.add("Gun");
        zamanListe.add("Hafta");
        zamanListe.add("Yil");

        buttonUzunluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim = "uzunluk";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("bildirim",bildirim);
                intent.putExtra("uzunluk",uzunlukListe);
                startActivity(intent);
            }
        });

        buttonAgirlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim = "agirlik";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("bildirim",bildirim);
                intent.putExtra("agirlik",agirlikListe);
                startActivity(intent);

            }
        });
        buttonSicaklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim = "sicaklik";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("sicaklik",sicaklikListe);
                intent.putExtra("bildirim",bildirim);
                startActivity(intent);
            }
        });
        buttonAlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim = "alan";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("alan",alanListe);
                intent.putExtra("bildirim",bildirim);
                startActivity(intent);
            }
        });
        buttonHiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim="hiz";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("hiz",hizListe);
                intent.putExtra("bildirim",bildirim);
                startActivity(intent);
            }
        });

        buttonZaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bildirim="zaman";
                Intent intent = new Intent(MainActivity.this,HesapActivity.class);
                intent.putExtra("zaman",zamanListe);
                intent.putExtra("bildirim",bildirim);
                startActivity(intent);
            }
        });

    }
}