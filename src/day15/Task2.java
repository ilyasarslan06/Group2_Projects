package day15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2:
Alan ve Çevre Hesaplama
1. Kare
2. Daire
Seçiminiz:

Yukarıdaki menüyü tasarlayınız.
Gerekli diğer kodlamaları yaparak alan ve çevre sonucunu gösteren Java programını yazınız.

Not: Seçim için switch kullanılacaktır.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kare ");
        System.out.println("2.Daire ");
        System.out.print("Seçiminiz ");
        int secim = input.nextInt();
        boolean flag=true;
        switch(secim){
            case 1 :
                System.out.println("Karenin kenar uzunluğunuz giriniz");
                int kenar = input.nextInt();
                int cevre = kenar*4;
                int alan = kenar*kenar;
                System.out.println("Karenin Alanı "+alan);
                System.out.println("Karenin Çevre "+cevre);
                break;
            case 2:
                System.out.println("Dairenin çapını giriniz");
                int cap = input.nextInt();
                double dcevre = 2*Math.PI*cap;
                double dalan = Math.PI*cap*cap;
                System.out.println("Dairenin Alanı "+dalan);
                System.out.println("Dairenin Çevre "+dcevre);
                break;
            default:
                System.out.println("yanlış işlem yaptınız");
                flag=false;
                break;
        }
        if(flag==true){
            System.out.println("İlyas senin aklın karışmış aslanım");
        }

    }
}
