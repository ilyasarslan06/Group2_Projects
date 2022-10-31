package day13;

public class Tekrar {
    public static void main(String[] args) {

        /*

        Osman DURMUŞ eski bir Milletvekili idi. Şu an 59 yaşındadır.
        Kamer GENÇ eski bir Milletvekili idi. Şu ann 70 yaşındadır.
         */

        String osmanIsım =" Osman DURMUŞ ";
        int osmanYas =59;

        String kamerIsım =" Kamer GENÇ ";
        int kamerYas =70;

        String mesaj = String.format("%s,eski bir milletvekilidir, %d yaşındadır. ",osmanIsım,osmanYas);
        System.out.println(mesaj);

        // %s stringten gelir isimler için ve %d sayılar için decimal den gelir.

        mesaj= String.format("%s eski bir milletvekilidir, %d yaşındadır. ", kamerIsım,kamerYas);
        System.out.println(mesaj );


    }
}
