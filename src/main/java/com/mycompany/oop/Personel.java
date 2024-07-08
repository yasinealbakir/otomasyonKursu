package com.mycompany.oop;

public abstract class Personel {

    private String ad;
    private String soyad;
    private String title;
    private int yas;

    public Personel(String ad, String soyad, String title, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.title = title;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 18) {
            System.out.println("18 yasindan kucukler calisamaz.");

        } else {
            this.yas = yas;
        }
    }

    public abstract void calis();

    public void dinlen() {
        System.out.println("Personel dinleniyor.");

    }

}
