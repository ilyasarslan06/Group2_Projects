package day17;

public class Task {
    public static void main(String[] args) {
        /*
        çift ve tek sayıları ayrı ayrı bulunuz ve kendi içlerinde ayrı ayrı toplayıp yazınız?
         */
        int tekToplam =0;
        int ciftToplam=0;

        for (int i = 1; i <100 ; i++) {
            if (i%2==0){
                ciftToplam+=i;
            }else {
                tekToplam+=i;
            }

            }
        System.out.println("1 den 100 e kadar olan tek sayıların toplamı =" +tekToplam);
        System.out.println("1 den 100 e kadar olan çift sayıların toplamı =" +ciftToplam);
        }
    }

