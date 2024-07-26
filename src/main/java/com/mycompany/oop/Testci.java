package com.mycompany.oop;

public class Testci extends Personel{

   
    public Testci(String ad, String soyad, String title, int yas) {
        super(ad, soyad, title, yas);
    }

    @Override
    public void calis() {
        System.out.println("Regresyon testi yapýyor.");

    }
    
    

}
