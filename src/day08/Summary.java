package day08;

public class Summary {
    public static void main(String[] args) {
        System.out.println("Merhaba!");

        String str= "23"+18;
        System.out.println(str);

        String mesaj= "Çocuklar,\n\thep bir ağızdan \"Neden biz susmak zorundayız?\" Dediler\b.";
        System.out.println(mesaj);

        // tırnak içerisinde \n bir sonraki cümleyi alt satıra alır.
        // \t tab anlamına gelir 8 karakter boşluk bırakır.
        // \b bir önceki harfi siler back space.

        int price=5;
        int quantitiy=8;
        int total = price*quantitiy;

        int price1,quantitiy1,total1;
        price1=5;
        quantitiy1=8;
        total1=price1*quantitiy1;

        int price2=5, quantitiy2=8;
        int total2= price2*quantitiy2;
        System.out.println(total);
        System.out.println(total1);
        System.out.println(total2);


    }
}
