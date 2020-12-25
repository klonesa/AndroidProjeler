package com.ma.MiniProje_OtoPark_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class ArsivEkrani extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rv;
    private ArrayList<VeriTabaniBasliklari> liste;
    private VeriTabaniOlustur vto;
    private AdapterSinifi adapter;
    private Button buttonAnaEkranaGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arsiv_ekrani);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);
        buttonAnaEkranaGit = findViewById(R.id.buttonAnaEkranaGit);
        vto =new VeriTabaniOlustur(this);

        toolbar.setTitle("arşiv ekrani");

        setSupportActionBar(toolbar);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        liste =new VeriTabaniMetodlar().oku(vto);

        adapter = new AdapterSinifi(this,liste);
        rv.setAdapter(adapter);


        buttonAnaEkranaGit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ArsivEkrani.this,MainActivity.class));
                finish();
            }
        });




    }
}