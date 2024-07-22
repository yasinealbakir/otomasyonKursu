package com.mycompany.oop;

public class Main {

    public static void main(String[] args) {
//        Kopek kopek = new Kopek();
//        kopek.setIsim("Karaba�");
//        kopek.setCinsi("Kurt");
//        kopek.setRengi("Siyah");
//        System.out.println(kopek.getIsim() + kopek.getCinsi() + kopek.getRengi());

        //Ogrenci ogrenci = new Ogrenci("Ahmet", "Erkek", 100);
//        Testci testci = new Testci("Ahmet", "Ak", "Test Uzman�", 19);
//        testci.setYas(20);
//        System.out.println("Yeni yasi: " + testci.getYas());
//        
//        testci.calis();
//        testci.dinlen();
//        Personel testMuhendisi = new Testci("Ahmet", "Ak", "Test Muhendisi", 30);
//        testMuhendisi.calis();
//        testMuhendisi.dinlen();
//        
//        Personel kidemliYazilimUzmani = new Yazilimci("Mehmet", "T�rk", "K�demli Yaz�l�m Uzman�", 29);
//        kidemliYazilimUzmani.calis();
//        kidemliYazilimUzmani.dinlen();
        /* 
           1- �� tane s�n�f olu�tur: Araba, Sedan, Hatchback
           2- kasaTipi, model, km, fiyat, kapiSayisi de�i�kenlerini tan�mla
           3- arabayiSur() methodunu olu�tur, bu metot ile araban�n km de�erini d��ardan verilen de�ere g�re art�rarak console ekran�na yazd�r.
           4- T�m s�n�flarda constructor olmas�na dikkat et, de�i�kenlerin tamam� veya bir k�sm� constructorda kullan�lmal�d�r.
           5- satisFiyati() ad�nda bir metot olustur, araban�n sat�� fiyat�n� belirle.
           6- Ana s�n�fta (Main.java) 2 farkl� ara� nesnesi olustur, bu ara�lar� s�r�p, fiyatlar�n� g�ncelle.
          
         */
        
        Sedan megane = new Sedan("Megane 4", 350, 750000, 4);
        System.out.println(
                " Aracin modeli : " + megane.getModel() + "\n"
                + " Kullanim Km: " + megane.getKm() + "\n"
                + " Fiyati : " + megane.getFiyat() + "\n"
                + " Kapi Sayisi: " + megane.getKapiSayisi()
        );

        megane.arabayiSur(50);
        megane.satisFiyati(745000);
        System.out.println("------------------------------------------");
        System.out.println(
                " Aracin modeli : " + megane.getModel() + "\n"
                + " Guncel Km: " + megane.getKm() + "\n"
                + " Guncel Fiyati : " + megane.getFiyat() + "\n"
                + " Kapi Sayisi: " + megane.getKapiSayisi()
        );
        System.out.println("------------------------------------------");
        Hatchback golf = new Hatchback("Golf 7", 5000, 900000, 5);
        System.out.println(
                " Aracin modeli : " + golf.getModel() + "\n"
                + " Kullanim Km: " + golf.getKm() + "\n"
                + " Fiyati : " + golf.getFiyat() + "\n"
                + " Kapi Sayisi: " + golf.getKapiSayisi()
        );

        golf.arabayiSur(50);
        golf.satisFiyati(850000);
        System.out.println("------------------------------------------");
        System.out.println(
                " Aracin modeli : " + golf.getModel() + "\n"
                + " Guncel Km: " + golf.getKm() + "\n"
                + " Guncel Fiyati : " + golf.getFiyat() + "\n"
                + " Kapi Sayisi: " + golf.getKapiSayisi()
        );

    }

}
