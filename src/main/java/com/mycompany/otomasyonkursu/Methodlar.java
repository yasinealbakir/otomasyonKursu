package com.mycompany.otomasyonkursu;

public class Methodlar {

    public static void main(String[] args) {
        Methodlar methodlar = new Methodlar();
        methodlar.konsolaYazdir("Test");
        System.out.println(methodlar.toplama(10, 20));
        methodlar.start();

    }

    public void konsolaYazdir(String metin) {
        System.out.println(metin);

    }

    public int toplama(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int toplama(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
    
    public void start(){
        System.out.println("Taray�c� ba�lat�yorum.");
    }
    
    public void start(String tarayici){
        System.out.println(tarayici + "taray�c�s�n� ba�lat�yorum.");
    }
    
    public void start (String tarayici, String url){
        System.out.println(tarayici + "taray�c�s�yla " + url + "site test ediliyo�r.");
    }

}
