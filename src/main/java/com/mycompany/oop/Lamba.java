package com.mycompany.oop;

public class Lamba {

    public boolean durum = true;
    public String konum;

    //---------------------------------------
    public Lamba(String konum) {
        this.konum = konum;
    }
    
    //---------------------------------------
    public void lambaDurumu() {
        if (durum == true) {
            System.out.println(konum + " lambasý AÇIK.");

        } else {
            System.out.println(konum + " lambasý KAPALI.");
        }
    }
    
    public static void main(String[] args) {
        Lamba salonLambasi = new Lamba("Salon");
        salonLambasi.lambaDurumu();
        salonLambasi.durum = false;
        salonLambasi.lambaDurumu();
        
        Lamba yatakOdasi = new Lamba("Yatak Odasý");
        yatakOdasi.durum = true;
        yatakOdasi.lambaDurumu();
    }

}
