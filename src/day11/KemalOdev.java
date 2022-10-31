package day11;

import java.util.Scanner;

public class KemalOdev {
    public static void main(String[] args) {
        int aralikOlmasiGereken = (12);
        int aralikOlmamasiGereken =(-1);

        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN SAYI GİRİNİZ = ");
        int sayi = input.nextInt();

        if (sayi<aralikOlmasiGereken){
            System.out.println("DOĞRU GİRDİNİZ");

        } else if (sayi>aralikOlmamasiGereken) {
            System.out.println("YANLIŞ GİRDİNİZ");

        }
        if (sayi<=aralikOlmasiGereken){
            System.out.println("LÜTFEN DEVAM EDİNİZ");
        }
    }


}


