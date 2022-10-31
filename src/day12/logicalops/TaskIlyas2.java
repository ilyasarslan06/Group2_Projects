package day12.logicalops;

import java.util.Scanner;

public class TaskIlyas2 {
    public static void main(String[] args) {
        //TODO: Aşağıdaki Java Programını Geliştiriniz.

        /*
        Verilen bir sayının 5 ve 2 ye tam bölünüp bölünmediğini bulan Java Programını yazınız.

        DURUM 1 = sayıların 5 ve 2 ye tam bölündüğünü veren java yazınız.
        DURUM2 = sayıların 5 ve 2 ye tam bölünmediğini veren jav yazınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN BİR DEĞER GİRİNİZ = ");
        int sayi = input.nextInt();
        if (sayi % 10 == 00) {
            System.out.printf("%d, Sayi 2 ve 5'e tam bölünür.", sayi);

    } else {
            System.out.printf("%d, Sayi 2 ve 5'e tam bölünemez. ", sayi);
        }

    }
}
