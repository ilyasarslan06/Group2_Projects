package day09;

import java.util.Scanner;

public class AritmetikOperatörler {
    public static void main(String[] args) {
        /*
        Arirmetik Operatörler

        (İkili Operatörler)
        + :operand1 + operand2 ÖRN: 7 <-- 3+7
        - :operand1 - operand2 ÖRN: 6 <-- 9-3
        * :operand1 * operand2 ÖRN: 20<-- 4*5
        / :operand1 / operand2 ÖRN: 4<--  8/2
        % :operand1 % operand2 ÖRN: 1<--  5%2
         */

        // Statement (int toplam = 3+4;) ve expression (=3+4;)
        int toplam = 3+4;
        System.out.println("Toplam:"+ toplam);


        //TASK: x,y ve z değerleri tanımlanacaktır. Sırasıyla 12, 10 ve x+y atamalarını yapınız? Daha sonra sout.

        int x= 10;
        int y= 12;
        int z= (x+y);
        System.out.println("Toplam =" + z);


        int a=9;
        int b=3;
        int sonuc = a-b;
        System.out.println("SONUÇ = "+ sonuc);


        int carpim= 4*5;
        System.out.println("4 x 5 =" +carpim);

        int bolum=8/2;
        System.out.println("8 / 2 =" +bolum);

        int blm= 7/2;
        System.out.println("7 /2 ="+blm);

        int kalan = 5%2;
        System.out.println("5 mod 2 = "+kalan);





    }
}
