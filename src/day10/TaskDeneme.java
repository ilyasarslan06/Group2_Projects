package day10;

public class TaskDeneme {
    public static void main(String[] args) {
        int kenar1=alanHesaplaa(3);
        int kenar2=alanHesaplaa(4);
        int alanToplami= kenar1+kenar2;
        System.out.println(alanToplami);


        /*
    Kenar uzunluğu verilen karenin alan hesaplaması yapılacaktır. bunun için karenin alanını geriye döndüren
    bir metor tasarlayınız. Daha sonra bu metodu main içerisinden çağırarak iki farklı karenin alanlarını toplayınız.
    metot ismi alanHesapla olacaktır.

         */
    }

    public static int alanHesaplaa(int alan){
        return 2*alan;
    }
}
