
package com.mycompany.oop;


public class Yazilimci extends Personel{

    public Yazilimci(String ad, String soyad, String title, int yas) {
        super(ad, soyad, title, yas);
    }

    @Override
    public void calis() {
        System.out.println("Kod yazýyor.");
    }
    
}
