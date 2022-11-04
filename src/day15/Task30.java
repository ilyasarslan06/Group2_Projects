package day15;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz = ");
        int sayi = input.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayı çift sayıdır.");
        }else{
            System.out.println("Girilen sayı tek sayıdır.");
        }
    }
}
