package com.testinium.atm.Musteri.Islem;

import com.testinium.atm.Musteri.Musteri;
import com.testinium.atm.Musteri.MusteriBilgileri;

import java.util.Scanner;

public class ParaIslemleri {

    static Scanner scanner=new Scanner(System.in);
    Musteri musteri=new Musteri();
    MusteriBilgileri musteriBilgileri=new MusteriBilgileri();
    GirisYap girisYap=new GirisYap();



    public void paraYatir(Musteri musteri){


        System.out.println("Yatırmak istediğiniz tutarı giriniz:");

        float yatiralacakTutar=scanner.nextFloat();
        float hesaptakiBakiye=MusteriBilgileri.musteriListem().get(girisYap.NumaraDondur()).getHesapBakiyesi();
        float paraYatirali=hesaptakiBakiye;

        if(yatiralacakTutar<0){
            System.out.println("Lütfen pozitif bir değer giriniz!");
        }
        else{
               musteri.setHesapBakiyesi(paraYatirali+yatiralacakTutar);


        }
        System.out.println("Güncel Bakiyeniz :"+musteri.getHesapBakiyesi());


    }

   public float paraCek(Musteri musteri){


        System.out.println("Çekmek istediğiniz tutarı giriniz:");
        float cekilecekTutar=scanner.nextFloat();
        float hesaptakiBakiye1=MusteriBilgileri.musteriListem().get(girisYap.musteriNumarasi).getHesapBakiyesi(); //musteri.getHesapBakiyesi();


        if(cekilecekTutar>hesaptakiBakiye1){
            System.out.println("YETERSİZ BAKİYE! \n Hesabınızdaki miktardan fazla çekim yapamazsınız.\n");
        }
        else if(cekilecekTutar<0){
            System.out.println("Lütfen pozitif bir değer giriniz!");
        }
        else {
           musteri.setHesapBakiyesi(hesaptakiBakiye1-cekilecekTutar);
        }
        System.out.println("Güncel bakiyeniz: " +musteri.getHesapBakiyesi());
        return musteri.getHesapBakiyesi();
    }

}
