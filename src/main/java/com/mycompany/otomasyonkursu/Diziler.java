package com.mycompany.otomasyonkursu;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author YASİN
 */
public class Diziler {

    public static void main(String[] args) {
        String[] hataliParolar = {"123", "abc", "789"};
        int[] sayilar = {1, 2, 3, 4};

        System.out.println(hataliParolar[2]);
        System.out.println(sayilar[0]);

        int[][] matriks = {
            {1, 3, 5}, {7, 8, 9}
        };

        ArrayList<String> kullaniciBilgiler = new ArrayList<>();
        kullaniciBilgiler.add("yasin");
        kullaniciBilgiler.add("test");
        kullaniciBilgiler.remove(0);
        kullaniciBilgiler.set(0, "deneme");

        System.out.println(kullaniciBilgiler.size());

        HashMap<String, String> kullaniciBilgileri = new HashMap<>();
        kullaniciBilgileri.put("test", "123");
        kullaniciBilgileri.put("deneme", "789");
        
        kullaniciBilgileri.replace("deneme", "456");

        System.out.println("Tüm anahtarlar: " + kullaniciBilgileri.keySet());
        System.out.println("Tüm anahtar-değerler: " + kullaniciBilgileri.entrySet());
        System.out.println("Tüm değerler: " + kullaniciBilgileri.values());
        System.out.println("Spesifik değer: " + kullaniciBilgileri.get("test"));
        System.out.println("Listenin boyu: " + kullaniciBilgileri.size());
        
        
        HashMap<String, Object> kullaniciBilgileri2 = new HashMap<>();
        kullaniciBilgileri2.put("test", true);
        
    }

}
