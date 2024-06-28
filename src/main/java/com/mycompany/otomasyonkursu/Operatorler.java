package com.mycompany.otomasyonkursu;

import java.text.MessageFormat;

/**
 *
 * @author YASİN
 */
public class Operatorler {

    public static void main(String[] args) {

        //Aritmetik Operatörler
        int sayi1 = 10;
        int sayi2 = 20;
        int result;
        result = sayi1 + sayi2;
        System.out.println(MessageFormat.format("Toplama :  {0}", result));
        System.out.println("Çıkarma" + String.valueOf(sayi1 - sayi2));
        System.out.println("Çarpma" + String.valueOf(sayi1 * sayi2));
        System.out.println("Bölme " + String.valueOf(sayi1 / sayi2));
        System.out.println("Mod : " + String.valueOf(sayi1 % sayi2));

        //Atama Operatörler
        sayi1 += 10;
        sayi1 -= 5;
        sayi1 *= 2;
        sayi1 /= 2;
        System.out.println("Sayi1 değeri " + sayi1);

        // Karşılaştırma operatörleri (<, >, ==, != , <=, >=)
        if (sayi1 != sayi2) {
            System.out.println("İki sayı birbine eşittir.");

        } else {
            System.out.println("İki sayı birbine eşit değildir.");
        }

        // Mantıksal operatörler (and, or)
        if (sayi1 == sayi2 || sayi2 > sayi2) {
            System.out.println("test");

        }

    }

}
