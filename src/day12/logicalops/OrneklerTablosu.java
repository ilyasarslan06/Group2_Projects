package day12.logicalops;

public class OrneklerTablosu {
    public static void main(String[] args) {
        //Mantıksal operatörler için örnekler

        //boolean b=!(4>3);
      //  System.out.println(b);
     //  boolean a=!(20<15);
       // System.out.println(a);

        /*
            Klavyeden girilen üç sayısın bir birlerine göre büyüklüklerini test
            ediniz. Ortaya çıkan sonuçları &, | , ^ ve ! ile işleme sokup ekranda gösteriniz.
         */

        int n1,n2,n3;
        n1= 105;
        n2= 75;
        n3= 35;

        boolean b1= n1>n2;
        boolean b2= n1>n3;
        boolean b3= n2>n3;

        System.out.println( " DURUM 1 VE DURUM 2 = "+ (b1&b2));

    }

    }
