package day15;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {

        // Dört İşlem Yapabilen Hesap Makinesi Tasarlayınız.

        System.out.println("-".repeat(20)); // tırnak içindeki sayı kadar tekrarla REPEAT
        System.out.println("     DÖRT İŞLEM     ");
        System.out.println("-".repeat(20));
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");
        System.out.println("-".repeat(20));
        System.out.print("seçiminizi yapınız :");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        int sonuc = 0;
        boolean flag=true;
        switch (secim) {
            case 1:
                System.out.println("toplamı bulunacak sayıları giriniz.");
                System.out.print("1.SAYI = ");
                int s1 = input.nextInt();
                System.out.print("2.SAYI = ");
                int s2 = input.nextInt();
                sonuc = s1 + s2;
                break;

            case 2:
                System.out.println("çıkarma");
                System.out.println("Çıkarma işleminde bulunacak sayıları giriniz.");
                System.out.print("1.SAYI = ");
                int s3 = input.nextInt();
                System.out.print("2.SAYI = ");
                int s4 = input.nextInt();
                sonuc = s3 - s4;
                System.out.println(sonuc);

                break;
            case 3:
                System.out.println("Çarpılacak sayıları giriniz.");
                System.out.println("Çarpılacak işleminde bulunacak sayıları giriniz.");
                System.out.print("1.SAYI = ");
                int s5 = input.nextInt();
                System.out.print("2.SAYI = ");
                int s6 = input.nextInt();
                sonuc = s5 * s6;
                System.out.println(sonuc);

            case 4:
                System.out.println("Bölünecek  bulunacak sayıları giriniz.");
                System.out.print("1.SAYI = ");
                int s7 = input.nextInt();
                System.out.print("2.SAYI = ");
                int s8 = input.nextInt();
                if (s8==0){
                    System.out.println("Geçersiz işlem yaptınız bir sayı 0 a bölünmez tanımsızdır.");
                    flag=false;
                    break;
                }
                sonuc = s7 / s8;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("yanlış işlem yaptınız");
                flag=false;
                break;
        }
        if (flag) {
            System.out.println("Sonuç " + sonuc);
        }
    }
}