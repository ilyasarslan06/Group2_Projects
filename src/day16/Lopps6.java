package day16;

public class Lopps6 {
    public static void main(String[] args) {
        //TODO :1'den 10'a kadar olan sayıların toplamını bulan bir java programı yazınız.

        int toplam=0; //toplama ve çıkarma işleminde yutan eleman 0 olduğu için yazıyorz.
        for (int i = 1; i <=10 ; i++) {
            toplam=toplam+i;

        }
        System.out.println("toplam = " +toplam);

    }
}
