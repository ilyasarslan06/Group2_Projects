package day11;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        int sayi =21;
        Scanner input = new Scanner(System.in);
        System.out.println("SAYI TUTTUM");
        System.out.print("BİR SAYI GİRİNİZ");
        int tahmin = input.nextInt();
        if (tahmin<sayi){
            System.out.println("DAHA BÜYÜK BİR SAYI GİRİNİZ.");
        } else if (tahmin>sayi) {
            System.out.println("DAHA KÜÇÜK BİR SAYI GİRİNİZ");{
             }

        }else {
            System.out.println("TEBRİKLER BİLDİNİZ");
        }

    }
}
