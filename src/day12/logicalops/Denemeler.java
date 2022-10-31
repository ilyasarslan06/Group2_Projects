package day12.logicalops;

public class Denemeler {
    public static void main(String[] args) {
/*
Mesela elimizde bir sayı olsun bu sayı 0'a eşitse ,
0'dan küçükse ve 0'dan büyükse gibi 3 seçenek olsun */
        int sayi = 50;

        if (sayi< 0) {
            System.out.println("say sıfırdan küçük");
        } else if (sayi>0) {
            System.out.println("sayı sıfırdan büyük");
        } else {
            System.out.println("sayı sıfıra eşittir.");
        }
    }

}
