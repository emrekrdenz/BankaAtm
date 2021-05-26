package com.testinium.atm.Musteri;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MusteriBilgileri {


    public static Musteri bireyselMusteri1(){
        return new BireyselMusteri("16940194082", "Emre Karadeniz", 36.15f, "36", "Ataşehir/İstanbul");
    }

    public static Musteri bireyselMusteri2(){
        return new BireyselMusteri("36940194082", "Ali Çark", 230.12f, "31", "İskenderun/Hatay");
    }

    public static Musteri bireyselMusteri3(){
        return new BireyselMusteri("46940194082", "Cihan Demir", 240.35f, "34", "Ümraniye/İstanbul");
    }

    public static Musteri kurumsalMusteri1(){
        return new KurumsalMusteri("66940194082", "Ahmet Uğur", 740, "1", "Kayıkçı Makine");
    }

    public static Musteri kurumsalMusteri2(){
        return new KurumsalMusteri("55940194082", "Anıl Aydoğan", 560.12f, "2", "Testinium");
    }

    public static Musteri kurumsalMusteri3(){
        return new KurumsalMusteri("12344533082", "Ahmet Yüce", 140, "3", "İnsider");
    }


    public static Map<String ,Musteri>musteriListem() {

        Map<String, Musteri> musteriMap = new HashMap<String, Musteri>();

        musteriMap.put(MusteriBilgileri.bireyselMusteri1().getMusteriNo(),MusteriBilgileri.bireyselMusteri1());
        musteriMap.put(MusteriBilgileri.bireyselMusteri2().getMusteriNo(),MusteriBilgileri.bireyselMusteri2());
        musteriMap.put(MusteriBilgileri.bireyselMusteri3().getMusteriNo(),MusteriBilgileri.bireyselMusteri3());
        musteriMap.put(MusteriBilgileri.kurumsalMusteri1().getMusteriNo(),MusteriBilgileri.kurumsalMusteri1());
        musteriMap.put(MusteriBilgileri.kurumsalMusteri2().getMusteriNo(),MusteriBilgileri.kurumsalMusteri2());
        musteriMap.put(MusteriBilgileri.kurumsalMusteri3().getMusteriNo(),MusteriBilgileri.kurumsalMusteri3());

        return musteriMap;


    }





}

