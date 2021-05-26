package com.testinium.atm.Musteri;

public class Musteri {

    private String tcKimlikNo;
    private String adSoyad;
    private float hesapBakiyesi;
    private String musteriNo;

    public Musteri() {
    }

    public Musteri(String tcKimlikNo, String adSoyad, float hesapBakiyesi, String musteriNo) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNo = musteriNo;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public void girisEkrani(){
        System.out.println("Bankamıza Hoşgeldiniz Sayın: " + MusteriBilgileri.musteriListem().get(getMusteriNo()).getAdSoyad()+"\n");
        System.out.println("Adı ve Soyadı :"+getAdSoyad()+"\n"+
                "TC Kimlik No: " +getTcKimlikNo() +"\n"+
                "Hesap Bakiyesi "+getHesapBakiyesi());

    }


}
