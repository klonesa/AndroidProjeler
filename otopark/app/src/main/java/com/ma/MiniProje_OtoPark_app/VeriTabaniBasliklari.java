package com.ma.MiniProje_OtoPark_app;

import java.io.Serializable;

public class VeriTabaniBasliklari implements Serializable {

    private int id;
    private String plaka;
    private String girisSaati;


    public VeriTabaniBasliklari() {
    }

    public VeriTabaniBasliklari(int id, String plaka, String girisSaati) {
        this.id = id;
        this.plaka = plaka;
        this.girisSaati = girisSaati;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getGirisSaati() {
        return girisSaati;
    }

    public void setGirisSaati(String girisSaati) {
        this.girisSaati = girisSaati;
    }


}
