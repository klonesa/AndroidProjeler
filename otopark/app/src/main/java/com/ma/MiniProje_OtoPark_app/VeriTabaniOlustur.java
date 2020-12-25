package com.ma.MiniProje_OtoPark_app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VeriTabaniOlustur extends SQLiteOpenHelper {
    public VeriTabaniOlustur(Context context) {
        super(context, "kayitliPlakalar",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS plakalar(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "plaka TEXT, girisSaati TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS plakalar");
        onCreate(db);
    }
}
