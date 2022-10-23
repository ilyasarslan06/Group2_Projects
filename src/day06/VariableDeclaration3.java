package day06;

public class VariableDeclaration3 {
    public static void main(String[] args) {
        /*------Veri Tipleri--------
            1. İlkel Tipler - Pirimitive Types
            2. Referans Tipler- Referance Types
         */

        //Tamsayı veri Tipleri
       // int sayiMax=2_147_483_647;
      //  int sayiMin=-2_147_483_648;
       // int sayiMax=Integer.MAX_VALUE;
      //  int sayiMin=Integer.MIN_VALUE;

        //System.out.println(sayiMax);
      //  System.out.println(sayiMin);

        //byte, short ,long içinde max min yazdıralım.

      // byte sayiMax = Byte.MAX_VALUE;
       //byte sayiMin = Byte.MIN_VALUE;
        //System.out.println("max = "+sayiMax);
        //System.out.println("min = "+sayiMin);

        //short sayiMax = Short.MAX_VALUE;
       // short sayiMin = Short.MIN_VALUE;
      //  System.out.println("max = "+sayiMax);
      //  System.out.println("min = "+sayiMin);

        //long sayiMax = Long.MAX_VALUE;
        //long sayiMin = Long.MIN_VALUE;
        //System.out.println("max="+sayiMax);
        //System.out.println("min="+sayiMin);

        // HERKES FARKLI ÇALIŞMA YAPMIŞ KOLAY OLANI DENİYORUM.

        int sayiMax = Integer.MAX_VALUE;
        int sayiMin = Integer.MIN_VALUE;
        byte sayiMax1 = Byte.MAX_VALUE;
        byte sayiMin1 = Byte.MIN_VALUE;
        short sayiMax2 = Short.MAX_VALUE;
        short sayiMin2 = Short.MIN_VALUE;
        long sayiMax3 = Long.MAX_VALUE;
        long sayiMin3 = Long.MIN_VALUE;
        System.out.println("max İnt = "+sayiMax);
        System.out.println("min İnt = "+sayiMin);
        System.out.println("max Byte = "+sayiMax1);
        System.out.println("min Byte = "+sayiMin1);
        System.out.println("max Short = "+sayiMax2);
        System.out.println("min Short = "+sayiMin2);
        System.out.println("max Long = "+sayiMax3);
        System.out.println("min Long = "+sayiMin3);



    }
}