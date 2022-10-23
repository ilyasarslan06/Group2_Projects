package day06;

import java.sql.SQLOutput;

public class VariableDeclaration {
    double  PI_SAYISI=3.14;
    public static void main(String[] args) {
        //Dikdörtgenin alan ve cevre hesabını yapan bir Java programı geliştiriniz.
        //Değişken tanımlamalarında Türkçe karakter kullanmayınız: ığüşçİÖÇç
        //Notasyonlar
        //1. Camel Notasyonu : kısaKenar (ilk kelime küçük sonraki baş harfleri BÜYÜK. DEĞİŞKEN VE METOT TANIMLAMALARINI YAPIYORUZ)
        //2. Pascal Notasyonu : Variable oluyor VariableDeclaration(Her kelimenin baş harfleri büyük olacak.SADECE SINIF İSİMLERİNİ YAPIYORUZ)
        //3. Snake Notasyonu :PI_SAYISI
        int sobaninBorusu;
        String arabaninKapisininRengi="Kırmızı";
        int kisaKenar = 7;
        int uzunKenar = 11;
        //Çevre Hesabı : 2* (Kısa Kenar *Uzun Kenar )
        //Alan Hesabı : Kısa Kenar * Uzun Kenar
        System.out.println(kisaKenar*uzunKenar);
        System.out.println(kisaKenar*2+uzunKenar*2);

        int dikdortgeninCevresi=2*(kisaKenar+uzunKenar); //statement
        int dikdortgeninAlani=kisaKenar*uzunKenar;

        //Concatenation = Birleştirme işlemi demek bir sayı ile kelimenin toplamı
        System.out.println("Kısa Kenar: "+kisaKenar);
        System.out.println("Uzun Kenar: "+uzunKenar);
        System.out.println();
        System.out.println("Dökdörtgenin Çevresi = "+dikdortgeninCevresi);
        System.out.println("Dikdörtgenin Alanı = "+dikdortgeninAlani);





    }
}
