

package com.mycompany.oop;


public class KullaniciTanimlamaSayfa implements Sayfa{

    @Override
    public void butonaTikla() {
        System.out.println("Kullan�c� Tan�mlama Sayfas�ndaki Kaydet butonuna t�kland�.");
    }

    @Override
    public void elementBul() {
        System.out.println("Kullan�c� Tan�mlama Sayfas�ndaki Kaydet butonunu bulundu.");
        
    }

}
