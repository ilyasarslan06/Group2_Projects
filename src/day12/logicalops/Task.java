package day12.logicalops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TODO: Aşağıdaki Java Programını Geliştiriniz.
        /*
        Verilen bir sayının 5 ve 2 ye tam bölünüp bölünmediğini bulan Java Programını yazınız.

        DURUM 1 = sayıların 5 ve 2 ye tam bölündüğünü veren java yazınız.
        DURUM2 = sayıların 5 ve 2 ye tam bölünmediğini veren jav yazınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.print(" Lutfen bir sayı giriniz = ");
        int sayi = input.nextInt();
        if (sayi % 5 == 0 | sayi % 2 == 0) {
            ;
            System.out.printf("%d, Sayı 2 ve 5' e tam bölünür. ", sayi);
        } else {
            System.out.printf("%d, sayı 2 ve 5'e tam bölünemez. ", sayi);
        }
    }
}
