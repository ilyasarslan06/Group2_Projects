package day09;

import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /*
        TASK: Klavyeden girilen iki sayının çarpımını bulup, ekrana yazan bir Java programı tasarlayınız.
         */

        // DEĞİŞKEN TANIMLAMAK İSTEREK CTRL+ALT+V yapabiliriz.


       Scanner klavyedenVeriGirisi= new Scanner(System.in);
       System.out.print( " BİRİNCİ SAYI = ");
       int sayi1 = klavyedenVeriGirisi.nextInt();
       System.out.print( "İKİNCİ SAYI = ");
       int sayi2 = klavyedenVeriGirisi.nextInt();
       int carpim=sayi1*sayi2;
       System.out.println(" ilk sayı x ikinci sayı = "+carpim);
















        Scanner klavyedenYazma= new Scanner(System.in);
        System.out.print(" Lütfen birinci sayıyı giriniz = ");
        int birinciSayi= klavyedenYazma.nextInt();
        System.out.print(" Lütfen ikinci sayıyı giriniz = ");
        int ikinciSayi= klavyedenYazma.nextInt();
        int sonuc= birinciSayi*ikinciSayi;
        System.out.println("Sonuç = "+ sonuc);

    }

}