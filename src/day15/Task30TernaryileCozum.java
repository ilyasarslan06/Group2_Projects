package day15;

import java.util.Scanner;

public class Task30TernaryileCozum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Lütfen bir sayı giriniz = ");
        int sayi = input.nextInt();

        String sonuc=sayi%2==0?"Bu bir çift sayıdır.":"Bu bir tek sayıdır.";

        System.out.println(sonuc);

        // ? turnary demek tersini al demek.

        //String sonuc = false?"Birinci Kısım":"İkinci Kısım";

        // true yazan yere FALSE yazarsak eğer İKİNCİ KISMI çalıştırır.

        //System.out.println(sonuc);
    }
}
