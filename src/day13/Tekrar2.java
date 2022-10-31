package day13;

public class Tekrar2 {
    public static void main(String[] args) {
        int sonuc = 2+4*7-3/2+5;
        //System.out.println(sonuc);

        //double x=7.0/2;

        //yukarıda ki sonucun tam çıkmasını istiyorsak sayılardan birinin yanına 0. koymalıyız.

        // System.out.println(x);

        //int bölmesinde sorun olabilir o yüzden tedbir almalısın. int sonucu hep intdir.
        //değerlerden birisinin kest etmemiz lazım. (double)k gibi.
//         int k=5;
//         int m=2 ;
//         double result=(double) k/m;
//        System.out.println(result);

//        int result = (int) (2+7+1.1);
//        System.out.println(result);

//        double d= 4/(double)5;
//        System.out.println(d);
//
//        double pi = 22d/7; // BURADAKİ d harfi Double anlamına gelir F de flout gibi
//        System.out.println(pi);
//        System.out.println(Math.PI);

        int sayi1=6;
        int sayi2=4;

        double sayi3=6/4; // 6/4 int değeri olduğu için kalanı tam vermez.
        double sayi4=6.0/4;
        double sayi5=6d/4;
        double sayi6=6/(double)4;
        System.out.println(sayi3);
        System.out.println(sayi4);
        System.out.println(sayi5);
        System.out.println(sayi6);




    }
}
