package day11;

import java.util.Scanner;

public class RelatOrnekler {
    public static void main(String[] args) {
        /*
        Klavyeden yaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen bir java programı yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print(" Kaç yaşındasınız :" );
        int yas = input.nextInt();


        // İF KULLANACAGIMIZ ZAMAN SÜSLÜ PARANTEZ İLE AÇ KAPA YAPIYORUZ.
        if (yas>=18){
            System.out.println("Siz yetişkinisiniz.");
        }
        // ELSE İF İN TERSİ YANİ EĞER DEĞİLSE DEMEK.
        else {
            System.out.println("Siz yetişikin değilsiniz.");
        }
    }
}
