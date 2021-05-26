import com.testinium.atm.Musteri.Islem.GirisYap;
import com.testinium.atm.Musteri.Islem.ParaIslemleri;
import com.testinium.atm.Musteri.Musteri;
import com.testinium.atm.Musteri.MusteriBilgileri;

import java.util.Scanner;

public class Main {

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

        Musteri musteri=new Musteri();
        MusteriBilgileri musteriBilgileri=new MusteriBilgileri();

        GirisYap girisYap=new GirisYap();
        girisYap.girisYap();

        islemGoster();

        boolean cikis=false;

        while (cikis==false){

            System.out.println("Seçiminizi Yapınız :");
            int secim=scanner.nextInt();

            switch (secim){

                case 1:

                    ParaIslemleri paraIslemleri =new ParaIslemleri();
                    paraIslemleri.paraYatir(musteri);
                    scanner.nextLine();
                    break;

                case 2:

                    ParaIslemleri paraIslemleri1 =new ParaIslemleri();
                    paraIslemleri1.paraCek(musteri);
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("Sistemden çıkış yapılıyor");
                    cikis=true;
                    break;
                default:
                    System.out.println("1-2-3 rakamlarından birini giriniz");
                    break;
            }

        }

    }

    private static void islemGoster() {
        System.out.println("*********İŞLEMLER***********");
        System.out.println("1 -- Para Yatır\n"+
                "2 -- Para Çek\n"+
                "3 -- Çıkış Yap\n");

    }



}



