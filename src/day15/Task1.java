package day15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task 1: Kullanıcıdan bir geometrik şeklin iç açı (3 adet) değerlerini alınız.
        // Verilen açılara göre; "Bu şekil bir üçgendir", "Bu şekil bir üçgen değildir" mesajı veren Java programını yazınız.
        //  Not: Üçgenin iç açıları toplamı 180'dir.//
        Scanner input = new Scanner(System.in);
        System.out.print("1.açıyı giriniz = ");
        int aci1 = input.nextInt();
        System.out.print("2.açıyı giriniz = ");
        int aci2 = input.nextInt();
        System.out.print("3.açıyı giriniz = ");
        int aci3 = input.nextInt();

        //if (aci1+aci2+aci3==180){
            //System.out.println("bu şekil bir üçgendir");
        //}else {
            //System.out.println("bu şekil bir üçgen değildir.");

        //TERNARY METODU İLE
        String sonuc=(aci1+aci2+aci3)==180? ("bu bir üçgendir") : ("bu bir üçgen değildir");
        System.out.println(sonuc);
        }


    }

