package com.ma.MiniProje_OtoPark_app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class VeriTabaniMetodlar {

    public void ekle (VeriTabaniOlustur vto,String plaka, String yazilacakGirisSaat){

        SQLiteDatabase database = vto.getWritableDatabase();
        ContentValues degerler = new ContentValues();

        degerler.put("plaka",plaka);
        degerler.put("girisSaati",yazilacakGirisSaat);


        database.insertOrThrow("plakalar",null,degerler);
        database.close();


    }

    public ArrayList<VeriTabaniBasliklari> oku (VeriTabaniOlustur vto){
        ArrayList<VeriTabaniBasliklari> liste = new ArrayList<>();

        SQLiteDatabase db = vto.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT * FROM plakalar",null);


        while(c.moveToNext()){
            VeriTabaniBasliklari vtb =new VeriTabaniBasliklari(c.getInt(c.getColumnIndex("id")),
                    c.getString(c.getColumnIndex("plaka")),
                    c.getString(c.getColumnIndex("girisSaati")) );

            liste.add(vtb);
        }
        return liste;



    }


    public void sil(VeriTabaniOlustur vto, int id){
        SQLiteDatabase db = vto.getWritableDatabase();
        db.delete("plakalar","id=?",new String[]{String.valueOf(id)});
        db.close();
    }


}
