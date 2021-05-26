package com.testinium.atm.Musteri;

public class KurumsalMusteri extends Musteri{

    private String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, float hesapBakiyesi, String musteriNo, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi, musteriNo);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void girisEkrani() {
        super.girisEkrani();
        System.out.println("Şirket Adı: " +getSirketAdi());
    }
}
