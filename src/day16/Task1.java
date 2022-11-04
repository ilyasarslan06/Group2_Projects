package day16;

public class Task1 {
    public static void main(String[] args) {
        /*
         Task 1:
0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yirmi dahil)
Task 2:
0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazınız.
Task 3:
0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran Java programını yazınız. (Sıfır ve yüz dahil)
Bugünlük 3 task yeter sanırım. İyi çalışmalar, iyi geceler dilerim.
     */
     /*   final int MAX=20;
        for (int i = 0; i <= MAX; i++) {
            if (i%2==0){
                System.out.print(i);
                if (i<MAX){
                    System.out.print(" - ");
                }
            }
        }*/
        for (int i = 0  ; i <=20 ; i+=2) {
            System.out.print(i+ " ");
        }
    }
}