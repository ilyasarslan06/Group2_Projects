package day10;

public class Task {
    public static void main(String[] args) {
        int kenar1=alanHesapla(2);
        int kenar2=alanHesapla(3);
       int toplam= kenar1+kenar2;
        System.out.println(toplam);


    }
    public static int alanHesapla(int kenar){
        return 2*kenar;

    }
    }
    /*
    Kenar uzunluğu verilen karenin alan hesaplaması yapılacaktır. bunun için karenin alanını geriye döndüren
    bir metor tasarlayınız. Daha sonra bu metodu main içerisinden çağırarak iki farklı karenin alanlarını toplayınız.
    metot ismi alanHesapla olacaktır.

         */


