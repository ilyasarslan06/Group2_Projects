package day12.logicalops;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        Mantıksal Operatörler
        &  (ampersant ): ve (and) operatörü
        |  (pipe)      : veya (or) operatörü
        ^              : xor operatörü
        !              : Değil anlamına gelir

        and (&) operatörü:

        true & true : true
        true & false : false
        false & true : false
        false & false : false

        veya  | operatörü

        true | true : true
        true | false : true
        false | true : true
        false | false : false


        xor ^ opeartörü

        true ^ true : false
        true ^ false : true
        false ^ true : true
        false ^ false : false

        not, değil ! operatörü
z
        !true : false
        !false : true

         */

        int yas =70;
        if (yas<18 | yas>=60){
            System.out.println("Hediye hakettiniz.");
        }else {
            System.out.println("Hediye haketmediniz.");
        }






    }
}
