package day16;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3:
0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
Java programını yazınız. (Sıfır ve yüz dahil)
         */
        final int MAX=100;
        int n1=5;
        int n2=2;
        for (int i = 0; i <=MAX ; i++) {
            if (i%(n1*n2)==0){
                System.out.print(i);
                if (i<MAX){
                    System.out.print(" - ");
                }

            }

        }
    }
}
