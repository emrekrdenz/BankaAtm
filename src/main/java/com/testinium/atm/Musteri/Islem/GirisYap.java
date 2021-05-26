package com.testinium.atm.Musteri.Islem;

import com.testinium.atm.Musteri.Musteri;
import com.testinium.atm.Musteri.MusteriBilgileri;

import java.util.Scanner;

public class GirisYap {



    static Scanner scanner=new Scanner(System.in);
   static String musteriNumarasi;



    public static void girisYap() {


        System.out.print("Testinium Bankasına Hoşgeldiniz...Lütfen Müşteri Numaranızı Giriniz: ");

        while (true){
            musteriNumarasi=scanner.nextLine();

            if(MusteriBilgileri.musteriListem().containsKey(musteriNumarasi)){
                MusteriBilgileri.musteriListem().get(musteriNumarasi).girisEkrani();
                break;
            }
            else{
                System.out.println("Eksik veya hatalı bir müşteri numarası girdiniz...Lütfen tekrar giriniz");
            }
        }
    }


  public String NumaraDondur() {
       /* String musteriNumarasi;
        musteriNumarasi=scanner.nextLine();
        return musteriNumarasi;*/
      return musteriNumarasi;
    }

}
