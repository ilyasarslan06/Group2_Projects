package day12.logicalops;

import java.util.Scanner;

public class denemeIlyas {
    public static void main(String[] args) {
        /*
        Verilen bir sayının hem 5'e hemde 3'e bölünüp bölünmediğiniğini bulan bir
        java programı yazınız.
        Durum 1 : her 2 sayıya aynı anda bölünebilme.
        Durum 2: sadece 5 ye bölünebilme.
        Durum 3: sadece 3 e bölünebilme.
        Durum 4. her iki sayıya da bölünememe.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1-100 arasında bir sayı giriniz =  ");
        int sayi = input.nextInt();
        if (sayi%5==0 & sayi%3==0){
            System.out.printf("%d, Hem 5'e hemde 3'e aynı anda bölünebilir. ",sayi);
        } else if (sayi%5==0) {
            System.out.printf("%d, sayı 5'e tam bölünebilir. ", sayi);
        } else if (sayi%3==0) {
            System.out.printf("%d, sayı 3'e tam bölünebilir. ", sayi);
        }else {
            System.out.printf("%d, ne 3 'e ve ne de 5'e tam bölünür. ", sayi);
        }
    }

}
