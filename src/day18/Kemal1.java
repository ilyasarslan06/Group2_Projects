package day18;

import java.io.InputStream;
import java.util.Scanner;

public class Kemal1 {
    public static void main(String[] args) {
       // TekrarliIsimGoster();
       // sayiYazdirma()
       // kdvHesaplama();
       // ortalamaHesaplama();


    }

    public static void TekrarliIsimGoster(){
        Scanner isimYazdirma = new Scanner(System.in);
        System.out.println("Lütfen adınızı yazını = ");
        String adi = isimYazdirma.nextLine();
        System.out.println("isminiz kaç kere yazdırılsın ?");
        int adet = isimYazdirma.nextInt();
        for (int i = 1; i <=adet; i++) {
            System.out.println(i+"."+adi);
        }
    }public static void sayiYazdirma(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaça kadar sayı yazılısın ? ");
        int kacaKadar = input.nextInt();
        System.out.println("kaçtan başlasın ? ");
        int kactannB = input.nextInt();
        for (int i = kactannB; i <=kacaKadar ; i++) {
            System.out.print(i+" ");

        }
    }public static void kdvHesaplama(){
        Scanner fiyat = new Scanner(System.in);
        System.out.println("Lütfen Fiyat Giriniz = ");
        int girilenFiyat = fiyat.nextInt();

        System.out.println();
        System.out.println("Lütfen kdv oranını Giriniz = ");
        int girilenkdv = fiyat.nextInt();
        System.out.print("Sonuç = " +(girilenFiyat*((girilenkdv/100.0)+1)));

    }public static void ortalamaHesaplama(){
        Scanner ortalama = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı giriniz = ");
        int sayi1 = ortalama.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz = ");
        int sayi2 = ortalama.nextInt();
        System.out.print("Lütfen 3. Sayıyı giriniz = ");
        int sayi3 = ortalama.nextInt();
        System.out.print("Lütfen 4. Sayıyı giriniz = ");
        int sayi4 = ortalama.nextInt();
        System.out.print("Lütfen 5. Sayıyı giriniz = ");
        int sayi5 = ortalama.nextInt();


        double ortalamaHesap=(sayi1+sayi2+sayi3+sayi4+sayi5)/5.0;
        System.out.println("Sonuc = "+ortalamaHesap);
    }
}
