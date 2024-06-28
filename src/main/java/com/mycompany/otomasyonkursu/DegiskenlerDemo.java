package com.mycompany.otomasyonkursu;

import java.text.MessageFormat;

/**
 *
 * @author YASİN
 */
public class DegiskenlerDemo {

    public static void main(String[] args) {
        /*
            psvm
            sout
         */

        byte sayi1 = 100;
        int sayi2 = 1500;
        double sayi3 = 45.10;
        String metin = "test";
        sayi2 = (byte) sayi1;
        System.out.println(sayi2);
        sayi2 = 900;

        sayi2 = (int) sayi3;
        System.out.println(sayi2);

        metin = String.valueOf(sayi2);
        System.out.println("String casting: " + metin);

        sayi2 = Integer.parseInt(metin);
        System.out.println("Integer casting: " + sayi2);
        
        System.out.println(MessageFormat.format("Integer casting1 : {0} {1}", sayi2, sayi1));

    }

}
