package com.mycompany.oop;

public class Main {

    public static void main(String[] args) {
//        Kopek kopek = new Kopek();
//        kopek.setIsim("Karabaþ");
//        kopek.setCinsi("Kurt");
//        kopek.setRengi("Siyah");
//        System.out.println(kopek.getIsim() + kopek.getCinsi() + kopek.getRengi());

        //Ogrenci ogrenci = new Ogrenci("Ahmet", "Erkek", 100);
        
//        Testci testci = new Testci("Ahmet", "Ak", "Test Uzmaný", 19);
//        testci.setYas(20);
//        System.out.println("Yeni yasi: " + testci.getYas());
//        
//        testci.calis();
//        testci.dinlen();
        
        
        Personel testMuhendisi = new Testci("Ahmet", "Ak", "Test Muhendisi", 30);
        testMuhendisi.calis();
        testMuhendisi.dinlen();
        
        Personel kidemliYazilimUzmani = new Yazilimci("Mehmet", "Türk", "Kýdemli Yazýlým Uzmaný", 29);
        kidemliYazilimUzmani.calis();
        kidemliYazilimUzmani.dinlen();
        
        /* 
           1- Üç tane sýnýf oluþtur: Araba, Sedan, Hatchback
           2- kasaTipi, model, km, fiyat, kapiSayisi deðiþkenlerini tanýmla
           3- arabayiSur() methodunu oluþtur, bu metot ile arabanýn km deðerini dýþardan verilen deðere göre artýrarak console ekranýna yazdýr.
           4- Tüm sýnýflarda constructor olmasýna dikkat et, deðiþkenlerin tamamý veya bir kýsmý constructorda kullanýlmalýdýr.
           5- satisFiyati() adýnda bir metot olustur, arabanýn satýþ fiyatýný belirle.
           6- Ana sýnýfta (Main.java) 2 farklý araç nesnesi olustur, bu araçlarý sürüp, fiyatlarýný güncelle.
          
        */
        
        
        
        
        
    
 
    }

}
