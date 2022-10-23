package day07;

public class Tasks {
    public static void main(String[] args) {

        //Benim adım İlyas ve 29 yaşındayım.
        //Önce bu şekliyle ekrana yazdırılacak. Daha sonra isim ve yaş değiştirilip yazılacak.

        String metin ="Benim adım İlyas ve 29 yaşındayım.";
        System.out.println(metin);

        String isim="İlyas";
        int yas=29;

        System.out.println("Benim adım "+isim+" ve ben "+yas+" yaşındayım.");

        String name = "Aslı";
        int yas1=29;

        System.out.println("Benim adım "+name+" ve ben "+yas1+" yaşında bir veterinerim.");

        String ad ="Mehmet Enes";
        int yas2 =31;
        int kilo =88;

        System.out.println("Benim adım "+ad+" ve ben "+yas2+" yaşındayım ayrıca "+kilo+" kiloyum .");

        String adi1= "İlyas";
        int yas4=29;

        adi1="ilyas";
        yas2 =29;

        System.out.println("Benim adım "+adi1+" ve ben "+yas4+" yaşındayım.");

        String benimAdim= "Hünkar";
        int kediyasi=6;

        benimAdim="Hünkar";
        kediyasi=6;

        System.out.println("benim adım "+benimAdim+" ve ben "+kediyasi+" yaşındayım.");

        String kediadi= "Ferhunde";
        int kediyasi1=6;

        System.out.println("Benim adım "+kediadi+" ben bir kediyim ve "+kediyasi1+" yaşındayım.");


        kediadi="Meral";
        kediyasi1=7;

        System.out.println("Ben bir kediyim ve benim adım "+kediadi+ " ve ben "+kediyasi1+" yaşındayım.");

        double agirlik=3.4;
        float agirlik2=1.3F;
// FLOAT AZ KULLANILIP DOUBLE ÇOK KULLANILDIĞI İÇİN FLOUTUN SONUNA F HARFİ GELİR.

        boolean buyukMu= 5>3;
        System.out.println(buyukMu);

        //boolean metodu sadece true veya false cevabı verir 1 bit.dir

        buyukMu=8>11;
        System.out.println(buyukMu);

        String mesaj= "bu bir deneme "+" mesajıdır.";
        System.out.println(mesaj);

        int kiymetliPara= 8;
        int kacAdetPara=20;
        int toplam= kiymetliPara*kacAdetPara;

        System.out.println(toplam);











    }
}
