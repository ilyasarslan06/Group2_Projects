package day14;

public class TaskSon {
    public static void main(String[] args) {
        //İki tamsayı değişkenine değerleri assign ediniz.
        /*
            Önce bunları isimleri ve değerleriyle birlikte ekrana yzadırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */
        int a=5, b=7;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);

        int Avni;

        Avni=a;
        a=b;
        b=Avni;

        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
    }
}
