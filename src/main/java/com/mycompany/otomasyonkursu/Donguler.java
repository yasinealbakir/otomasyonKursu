package com.mycompany.otomasyonkursu;

/**
 *
 * @author YASİN
 */
public class Donguler {

    public static void main(String[] args) {

        //switchCaseDemo();
        //forDongusuDemo();
        //whileDongusu();
        hataYakalama();

    }

    public void ifElseDemo() {
        int sayi1 = 10;
        int sayi2 = 11;
        if (sayi1 > sayi2) {
            System.out.println("sayi1 sayi2den büyüktür");

        } else {
            System.out.println("sayi2 sayi1den büyük veya eşittir.");
        }

        int sonuc = 11;
        int islem = 5 + 5;
        String testSonucu = (sonuc == islem) ? "Test başarılı" : "test başarısız";

        System.out.println(testSonucu);
    }

    public static void switchCaseDemo() {
        String gunler = "Pazar";
        switch (gunler) {
            case "Pazar" -> {
                System.out.println("Hafta sonu");
            }
            case "Pazartesi" -> {
                System.out.println("Hafta içi");
            }
            default -> {
                System.out.println("Tanımsız");
            }
        }
    }

    public static void forDongusuDemo() {
        String[] isimler = {
            "Onur", "Ali", "Veli"
        };

//        for (int i = 0; i < isimler.length; i++) {
//            System.out.println(isimler[i]);
//            
//        }
        for (String isim : isimler) {
            System.out.println(isim);

        }

    }

    public static void whileDongusu() {
        int i = 10;
        while (i <= 10) {
            System.out.println("i 10dan küçüktür");
            i++;
        }
    }

    public static void doWhileDongusu() {
        int hataliGirisSayisi = 0;
        do {
            hataliGirisSayisi++;
            // selenium;

        } while (hataliGirisSayisi > 3);

    }

    enum tarayicilar {
        CHROME, FIREFOX, EDGE, OPERA, SAFARI
    }

    public static void enumDemo() {

        tarayicilar tarayaci = tarayicilar.CHROME;
        switch (tarayaci) {
            case CHROME -> {
                // chrome için kodlar
            }
            case FIREFOX -> {
                //firefox için kodlar
            }
            case EDGE -> {
                // edge için
            }
        }

    }

    public static void hataYakalama() {
        int dizi[] = {1, 2, 3};
        try {
            System.out.println(dizi[4]);
        } catch (ArrayIndexOutOfBoundsException mesaj) {
            System.out.println("hatalı bir durum var.");

        }

        System.out.println("sonraki kod bloğu");
    }

}
