package day16;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2:
        0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.
         */
/*
        int toplam=0;
        for (int i = 0; i <20 ; i++) {
            if (i%2==1){
                toplam+=i;
            }
        }
        System.out.println("Toplam = "+toplam );
*/
        int toplam=0;
        for (int i = 1; i < 20; i+=2) {
            toplam+=i;

        }
        System.out.println("toplam = "+toplam);
    }
}
