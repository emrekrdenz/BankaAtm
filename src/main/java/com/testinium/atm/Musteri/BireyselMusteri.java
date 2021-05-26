package com.testinium.atm.Musteri;

public class BireyselMusteri extends Musteri {

    private String evAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, float hesapBakiyesi, String musteriNo, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, musteriNo);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void girisEkrani() {
        super.girisEkrani();
        System.out.println("Ev Adresi: " +getEvAdresi());
    }
}
