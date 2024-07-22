package com.mycompany.oop;

public class Araba {

    private String kasaTipi;
    private String model;
    private int km;
    private int fiyat;
    private int kapiSayisi;

    public Araba(String kasaTipi, String model, int km, int fiyat, int kapiSayisi) {
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.km = km;
        this.fiyat = fiyat;
        this.kapiSayisi = kapiSayisi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void arabayiSur(int kullanilanKm) {
        this.km += kullanilanKm;
        System.out.println(" Arabanin yeni kilometresi " + this.km);
    }

    public void satisFiyati(int yeniSatisFiyati) {
        this.fiyat = yeniSatisFiyati;
    }

}
