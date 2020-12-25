package com.ma.MiniProje_OtoPark_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private Button buttonGiris,buttonArsiv;
    private EditText editTextPlaka;
    //private VeriTabaniOlustur vto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonArsiv = findViewById(R.id.buttonArsiv);
        buttonGiris = findViewById(R.id. buttonGiris);
        editTextPlaka = findViewById(R.id.editTextPlaka);

        //vto = new VeriTabaniOlustur(this);

        final String plaka = editTextPlaka.getText().toString();

        Calendar c = Calendar.getInstance();
        final int girisSaati = c.get(Calendar.HOUR_OF_DAY);
        final int girisDakikasi = c.get(Calendar.MINUTE);

        /*
        for(int i =15; i < 25;i++){
            hepsiniSil(vto,i);
        }

         */


        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String plaka = editTextPlaka.getText().toString();
                Intent intent = new Intent(MainActivity.this,GirisEkrani.class);
                intent.putExtra("plaka",plaka);
                intent.putExtra("girisSaati",girisSaati);
                intent.putExtra("girisDakikasi",girisDakikasi);
                startActivity(intent);
                finish();
            }
        });

        buttonArsiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ArsivEkrani.class));
                finish();
            }
        });

    }

    public void hepsiniSil(VeriTabaniOlustur vto, int i){
        SQLiteDatabase db = vto.getWritableDatabase();
        db.delete("plakalar","id=?",new String[]{String.valueOf(i)});
        db.close();
    }
}