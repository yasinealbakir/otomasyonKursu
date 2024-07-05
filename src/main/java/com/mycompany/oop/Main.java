package com.mycompany.oop;

public class Main {

    public static void main(String[] args) {
        Kopek kopek = new Kopek();
        kopek.setIsim("Karabaþ");
        kopek.setCinsi("Kurt");
        kopek.setRengi("Siyah");
        System.out.println(kopek.getIsim() + kopek.getCinsi() + kopek.getRengi());

    }

}
