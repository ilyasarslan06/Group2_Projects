package day12.logicalops;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        /*
        Verilen bir sayının hem 2'ye hemde 3'e bölünüp bölünmediğiniğini bulan bir
        java programı yazınız.
        Durum 1 : her 2 sayıya aynı anda bölünebilme.
        Durum 2: sadece 2 ye bölünebilme.
        Durum 3: sadece 3 e bölünebilme.
        Durum 4. her iki sayıya da bölünememe.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz = ");
        int sayi = input.nextInt();

        if (sayi%2==0 & sayi%3==0) {
            System.out.printf("%d, hem 2'ye hemde 3'e bölünür.", sayi);
            // %d , sondaki sayının karşılığıdır.
            System.out.println();
        } else if (sayi%2==0) {
            System.out.printf("%d, sadece 2'ye bölünebilir.", sayi);
        } else if (sayi%3==0) {
            System.out.printf("%d, sadece 3'e bölünebilir.",sayi);
        } else {
            System.out.printf("%d,ne 2 ye ne de 2 e tam bölünür.", sayi);
        }


    }
}
