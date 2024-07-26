

package com.mycompany.oop;


public class KullaniciTanimlamaSayfa implements Sayfa{

    @Override
    public void butonaTikla() {
        System.out.println("Kullanýcý Tanýmlama Sayfasýndaki Kaydet butonuna týklandý.");
    }

    @Override
    public void elementBul() {
        System.out.println("Kullanýcý Tanýmlama Sayfasýndaki Kaydet butonunu bulundu.");
        
    }

}
