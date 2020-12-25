package com.ma.MiniProje_Donusturucu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class HesapActivity extends AppCompatActivity {
    private ArrayList<String> uzunlukListe,agirlikListe,sicaklikListe,alanListe,hizListe,zamanListe;
    private EditText editTextGirdi;
    private EditText editTextCikti;
    private Spinner spinnerBir,spinnerIki;
    private ArrayAdapter<String> uzunlukAdapter;
    private ArrayAdapter<String> agirlikAdapter ;
    private ArrayAdapter<String> sicaklikAdapter;
    private ArrayAdapter<String> alanAdapter;
    private ArrayAdapter<String> hizAdapter;
    private ArrayAdapter<String> zamanAdapter;
    private Button buttonCE,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonEksi,buttonVirgul;
    private String girdi;
    private ImageView imageViewDonustur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesap);

        spinnerBir = findViewById(R.id.spinnerBir);
        spinnerIki = findViewById(R.id.spinnerIki);

        editTextGirdi = findViewById(R.id.editTextGirdi);
        editTextCikti = findViewById(R.id.editTextCikti);


        imageViewDonustur=findViewById(R.id.imageViewDonustur);
        buttonCE=findViewById(R.id.buttonCE);
        buttonVirgul=findViewById(R.id.buttonVirgul);
        buttonEksi=findViewById(R.id.buttonEksi);
        button0=findViewById(R.id.button0);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);

        uzunlukListe = getIntent().getStringArrayListExtra("uzunluk");
        agirlikListe = getIntent().getStringArrayListExtra("agirlik");
        sicaklikListe = getIntent().getStringArrayListExtra("sicaklik");
        alanListe = getIntent().getStringArrayListExtra("alan");
        hizListe = getIntent().getStringArrayListExtra("hiz");
        zamanListe = getIntent().getStringArrayListExtra("zaman");

        final String gelenBildirim =getIntent().getStringExtra("bildirim");

        girdi = editTextGirdi.getText().toString();

        if(gelenBildirim.equals("uzunluk")){
            uzunlukAdapter= new ArrayAdapter<>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,uzunlukListe);
            spinnerBir.setAdapter(uzunlukAdapter);
            spinnerIki.setAdapter(uzunlukAdapter);



        }
        if(gelenBildirim.equals("agirlik")){
            agirlikAdapter= new ArrayAdapter<String>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,agirlikListe);
            spinnerBir.setAdapter(agirlikAdapter);
            spinnerIki.setAdapter(agirlikAdapter);

        }
        if(gelenBildirim.equals("sicaklik")){
            sicaklikAdapter= new ArrayAdapter<String>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,sicaklikListe);
            spinnerBir.setAdapter(sicaklikAdapter);
            spinnerIki.setAdapter(sicaklikAdapter);

        }
        if(gelenBildirim.equals("alan")){
            alanAdapter= new ArrayAdapter<String>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,alanListe);
            spinnerBir.setAdapter(alanAdapter);
            spinnerIki.setAdapter(alanAdapter);

        }
        if(gelenBildirim.equals("hiz")){
            hizAdapter= new ArrayAdapter<String>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,hizListe);
            spinnerBir.setAdapter(hizAdapter);
            spinnerIki.setAdapter(hizAdapter);

        }
        if(gelenBildirim.equals("zaman")){
            zamanAdapter= new ArrayAdapter<String>(HesapActivity.this,
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,zamanListe);
            spinnerBir.setAdapter(zamanAdapter);
            spinnerIki.setAdapter(zamanAdapter);

        }

        buttonEksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi =Integer.valueOf(editTextGirdi.getText().toString());

                editTextGirdi.setText(String.valueOf(sayi*-1));
                girdi = editTextGirdi.getText().toString();
            }
        });
        buttonVirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + ".");
                girdi = editTextGirdi.getText().toString();
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(" ");
                editTextCikti.setText(" ");
                girdi = " ";

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(0));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(1));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(2));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(3));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(4));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(5));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(6));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(7));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(8));
                girdi = editTextGirdi.getText().toString();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextGirdi.setText(editTextGirdi.getText().toString() + String.valueOf(9));
                girdi = editTextGirdi.getText().toString();

            }
        });

        imageViewDonustur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spinner1Secilen = spinnerBir.getSelectedItem().toString();
                String spinner2Secilen = spinnerIki.getSelectedItem().toString();

                // birim olarak uzunluk secildiyse
                if (gelenBildirim.equals("uzunluk")) {
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("MiliMetre")) {
                        if (spinner2Secilen.equals("MiliMetre")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("SantiMetre")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("Metre")) {
                            editTextCikti.setText(String.valueOf(sayi / 1000));
                        }
                        if (spinner2Secilen.equals("KiloMetre")) {
                            String sayi2 = String.valueOf(sayi / 1000000);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("SantiMetre")) {
                        if (spinner2Secilen.equals("MiliMetre")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("SantiMetre")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Metre")) {
                            editTextCikti.setText(String.valueOf(sayi / 100));
                        }
                        if (spinner2Secilen.equals("KiloMetre")) {
                            editTextCikti.setText(String.valueOf(sayi / 100000));
                        }
                    }
                    if (spinner1Secilen.equals("Metre")) {
                        if (spinner2Secilen.equals("MiliMetre")) {
                            editTextCikti.setText(String.valueOf(sayi * 1000));
                        }
                        if (spinner2Secilen.equals("SantiMetre")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("Metre")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("KiloMetre")) {
                            editTextCikti.setText(String.valueOf(sayi / 1000));
                        }
                    }
                    if (spinner1Secilen.equals("KiloMetre")) {
                        if (spinner2Secilen.equals("MiliMetre")) {
                            editTextCikti.setText(String.valueOf(sayi * 1000000));
                        }
                        if (spinner2Secilen.equals("SantiMetre")) {
                            editTextCikti.setText(String.valueOf(sayi * 100000));
                        }
                        if (spinner2Secilen.equals("Metre")) {
                            editTextCikti.setText(String.valueOf(sayi * 1000));
                        }
                        if (spinner2Secilen.equals("KiloMetre")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                    }
                }
                // birim olarak agirlik secildiyse
                if (gelenBildirim.equals("agirlik")) {
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("MiliGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 100));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi / 1_000));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10_000));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 100_000));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 1_000_000);
                            editTextCikti.setText(sayi2);
                        }

                    }

                    if (spinner1Secilen.equals("SantiGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi / 100));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 1_000));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10_000));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 100_000);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("DesiGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 100));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 1_000));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 10_000);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("Gram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 1000));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 100));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 1_000);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("DekaGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10_000));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 1000));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi / 10));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 100);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("HektoGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100_000));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10_000));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 1_000));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi / 10);
                            editTextCikti.setText(sayi2);
                        }

                    }
                    if (spinner1Secilen.equals("KiloGram")) {
                        if (spinner2Secilen.equals("MiliGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 1_000_000));
                        }
                        if (spinner2Secilen.equals("SantiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100_000));
                        }
                        if (spinner2Secilen.equals("DesiGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10_000));
                        }
                        if (spinner2Secilen.equals("Gram")) {
                            editTextCikti.setText(String.valueOf(sayi * 1_000));
                        }
                        if (spinner2Secilen.equals("DekaGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 100));
                        }
                        if (spinner2Secilen.equals("HektoGram")) {
                            editTextCikti.setText(String.valueOf(sayi * 10));
                        }
                        if (spinner2Secilen.equals("KiloGram")) {
                            String sayi2 = String.valueOf(sayi);
                            editTextCikti.setText(sayi2);
                        }

                    }

                }
                if (gelenBildirim.equals("sicaklik")) {
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("Celsius")) {
                        if (spinner2Secilen.equals("Celsius")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Fahrenheit")) {

                            editTextCikti.setText(String.valueOf( ((sayi * 180)+3200) /100) );
                        }
                        if (spinner2Secilen.equals("Kelvin")) {
                            editTextCikti.setText(String.valueOf( sayi +273));
                        }

                    }
                    if (spinner1Secilen.equals("Fahrenheit")) {
                        if (spinner2Secilen.equals("Celsius")) {
                            editTextCikti.setText(String.valueOf(((sayi*100)-3200)/180));
                        }
                        if (spinner2Secilen.equals("Fahrenheit")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Kelvin")) {
                            editTextCikti.setText(String.valueOf(((sayi *5)+263)/3));
                        }

                    }
                    if (spinner1Secilen.equals("Kelvin")) {
                        if (spinner2Secilen.equals("Celsius")) {
                            editTextCikti.setText(String.valueOf(((sayi*100)-27300)/100));
                        }
                        if (spinner2Secilen.equals("Fahrenheit")) {
                            editTextCikti.setText(String.valueOf(((sayi*5)-2297)/9));
                        }
                        if (spinner2Secilen.equals("Kelvin")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }

                    }
                }
                if(gelenBildirim.equals("alan")){
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("MiliMetreKare")) {
                        if (spinner2Secilen.equals("MiliMetreKare")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("SantiMetreKare")) {

                            editTextCikti.setText(String.valueOf(sayi / 100) );
                        }
                        if (spinner2Secilen.equals("MetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi /1000000));
                        }
                        if (spinner2Secilen.equals("Hektar")) {
                            editTextCikti.setText(String.valueOf( sayi /10_000_000_000L));
                        }
                        if (spinner2Secilen.equals("KiloMetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi/1_000_000_000_000L));
                        }

                    }
                    if (spinner1Secilen.equals("SantiMetreKare")) {
                        if (spinner2Secilen.equals("MiliMetreKare")) {
                            editTextCikti.setText(String.valueOf(sayi*100));
                        }
                        if (spinner2Secilen.equals("SantiMetreKare")) {

                            editTextCikti.setText(String.valueOf(sayi) );
                        }
                        if (spinner2Secilen.equals("MetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi /10_000));
                        }
                        if (spinner2Secilen.equals("Hektar")) {
                            editTextCikti.setText(String.valueOf( sayi /100_000_000L));
                        }
                        if (spinner2Secilen.equals("KiloMetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi/10_000_000_000L));
                        }

                    }
                    if (spinner1Secilen.equals("MetreKare")) {
                        if (spinner2Secilen.equals("MiliMetreKare")) {
                            editTextCikti.setText(String.valueOf(sayi*1_000_000));
                        }
                        if (spinner2Secilen.equals("SantiMetreKare")) {

                            editTextCikti.setText(String.valueOf(sayi*10000) );
                        }
                        if (spinner2Secilen.equals("MetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi));
                        }
                        if (spinner2Secilen.equals("Hektar")) {
                            editTextCikti.setText(String.valueOf( sayi /10_000));
                        }
                        if (spinner2Secilen.equals("KiloMetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi/1_000_000));
                        }

                    }
                    if (spinner1Secilen.equals("Hektar")) {
                        if (spinner2Secilen.equals("MiliMetreKare")) {
                            editTextCikti.setText(String.valueOf(sayi*10_000_000_000L));
                        }
                        if (spinner2Secilen.equals("SantiMetreKare")) {

                            editTextCikti.setText(String.valueOf(sayi*100_000_000) );
                        }
                        if (spinner2Secilen.equals("MetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi*10_000));
                        }
                        if (spinner2Secilen.equals("Hektar")) {
                            editTextCikti.setText(String.valueOf( sayi));
                        }
                        if (spinner2Secilen.equals("KiloMetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi/100));
                        }

                    }
                    if (spinner1Secilen.equals("KiloMetreKare")) {
                        if (spinner2Secilen.equals("MiliMetreKare")) {
                            editTextCikti.setText(String.valueOf(sayi*1_000_000_000_000L));
                        }
                        if (spinner2Secilen.equals("SantiMetreKare")) {

                            editTextCikti.setText(String.valueOf(sayi*10_000_000) );
                        }
                        if (spinner2Secilen.equals("MetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi*1_000_000));
                        }
                        if (spinner2Secilen.equals("Hektar")) {
                            editTextCikti.setText(String.valueOf( sayi*100));
                        }
                        if (spinner2Secilen.equals("KiloMetreKare")) {
                            editTextCikti.setText(String.valueOf( sayi));
                        }

                    }
                }
                if(gelenBildirim.equals("hiz")){
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("SantiMetre/Saniye")) {
                        if (spinner2Secilen.equals("SantiMetre/Saniye")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Metre/Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi / 100) );
                        }
                        if (spinner2Secilen.equals("KiloMetre/Saat")) {
                            editTextCikti.setText(String.valueOf( (sayi /1000)*36));
                        }
                    }
                    if (spinner1Secilen.equals("Metre/Saniye")) {
                        if (spinner2Secilen.equals("SantiMetre/Saniye")) {
                            editTextCikti.setText(String.valueOf(sayi*100));
                        }
                        if (spinner2Secilen.equals("Metre/Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi) );
                        }
                        if (spinner2Secilen.equals("KiloMetre/Saat")) {
                            editTextCikti.setText(String.valueOf( (sayi /10)*36));
                        }
                    }
                    if (spinner1Secilen.equals("KiloMetre/Saat")) {
                        if (spinner2Secilen.equals("SantiMetre/Saniye")) {
                            editTextCikti.setText(String.valueOf(sayi*27.77));
                        }
                        if (spinner2Secilen.equals("Metre/Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*0.277) );
                        }
                        if (spinner2Secilen.equals("KiloMetre/Saat")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                    }
                }
                if(gelenBildirim.equals("zaman")){
                    double sayi = Double.valueOf(girdi);

                    if (spinner1Secilen.equals("MiliSaniye")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi / 1000) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( (sayi /100_000)*1.66));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf( (sayi /100_000)*0.027));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000_000)*0.115));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000_000)*0.0165));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000_000_000L)*0.316));
                        }
                    }
                    if (spinner1Secilen.equals("Saniye")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*1000));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi *0.016));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi*0.000278 ));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000)*0.115));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000)*0.0165));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( (sayi /10_000)*0.000317));
                        }
                    }
                    if (spinner1Secilen.equals("Dakika")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*60000));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*60) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi*0.0166 ));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf(sayi *0.000694));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf( (sayi /10)*0.000992));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( (sayi /1000)*0.001901));
                        }
                    }
                    if (spinner1Secilen.equals("Saat")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*3600000));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*3600) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi*60));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf(sayi /24));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf(sayi *0.005952));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( sayi *0.000114));
                        }
                    }
                    if (spinner1Secilen.equals("Gun")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*86400000));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*86400) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi*1440));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi*24));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf(sayi/7));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( sayi/365));
                        }
                    }
                    if (spinner1Secilen.equals("Hafta")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*604800000));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*604800) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi*10080));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi*168));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf(sayi*7));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf(sayi));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( sayi/52));
                        }
                    }
                    if (spinner1Secilen.equals("Yil")) {
                        if (spinner2Secilen.equals("MiliSaniye")) {
                            editTextCikti.setText(String.valueOf(sayi*31_557_600_000L));
                        }
                        if (spinner2Secilen.equals("Saniye")) {

                            editTextCikti.setText(String.valueOf(sayi*31_557_600) );
                        }
                        if (spinner2Secilen.equals("Dakika")) {
                            editTextCikti.setText(String.valueOf( sayi*525_960));
                        }
                        if (spinner2Secilen.equals("Saat")) {
                            editTextCikti.setText(String.valueOf(sayi*8766));
                        }
                        if (spinner2Secilen.equals("Gun")) {
                            editTextCikti.setText(String.valueOf(sayi*365));
                        }
                        if (spinner2Secilen.equals("Hafta")) {
                            editTextCikti.setText(String.valueOf(sayi*52));
                        }
                        if (spinner2Secilen.equals("Yil")) {
                            editTextCikti.setText(String.valueOf( sayi));
                        }
                    }
                }
            }
        });

    }
}