package day15;

import java.util.Scanner;

public class MenuTasarimi {
    public static void main(String[] args) {
        // Dört İşlem Yapabilen Hesap Makinesi Tasarlayınız.
        System.out.println("-".repeat(20)); // tırnak içindeki sayı kadar tekrarla REPEAT
        System.out.println("     DÖRT İŞLEM     ");
        System.out.println("-".repeat(20));
        System.out.println("1.Toplama");
        System.out.println("2.Çıkarma");
        System.out.println("3.Çarpma");
        System.out.println("4.Bölme");
        System.out.println("-".repeat(20));
        System.out.print("seçiminizi yapınız :");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();
        switch (secim){
            case 1:
                System.out.println("toplama"); break;
            case 2:
                System.out.println("çıkarma"); break;
            case 3:
                System.out.println("çarpma"); break;
            case 4:
                System.out.println("bölme"); break;
            default:
                System.out.println("yanlış işlem yaptınız"); break;
        }
    }
}
