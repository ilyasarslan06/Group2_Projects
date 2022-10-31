package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        TASK: Klavyeden iki ayrı kareye ait kenar bilgisi girilecektir.
        Her iki karenin alanını hesaplayan metodu yazınız. Elde edilen sonuçları kıyaslayıp hangi
        karenin alanının büyük olduğunu belirtiniz.

        1. kenar1 ve kenar2 değerlerini klavyeden okuyup, saklayınız.
        2. public static int alanHesapla(int kenar) metodu yazınız.
        3. main metodu içinde alanHesapla(k) metodunu kenar1 ve kenar2 için çağırınız.
        4. dönen sonuçları alan1 ve alan2'de saklayınız.
        5. if ile alan1 ve alan2'nin <.> ve eşit olma durumunu ekrana yazdırınız.
         */
//1
        Scanner input = new Scanner(System.in);
        System.out.print("1.Karenin kenar ölçülerini giriniz : ");
        int kenar1 = input.nextInt();
        System.out.print("2.Karenin kenar ölçülerini giriniz : ");
        int kenar2 = input.nextInt();
//3
        int alan1 = alanHesapla(kenar1);
        int alan2 = alanHesapla(kenar2);

        if(alan1>alan2){
            System.out.println("BİRİNCİ KARENİN ALANI DAHA BÜYÜKTÜR.");
        } else if (alan1<alan2) {
            System.out.println("İKİNCİ KARENİN ALANI DAHA BÜYÜKTÜR");
        } else {
            System.out.println("HER İKİ KARENİN ALANLARI EŞİTTİR.");
        }
    }
  //2
    public static int alanHesapla (int kenar){
        return kenar*kenar;
    }

}