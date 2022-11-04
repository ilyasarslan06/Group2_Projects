package day15;

public class SwitchKullanimi {
    public static void main(String[] args) {
        //boolean b=true; switch metoduna double ve float kullanamayız.
        int secim =99;    // buradaki değeri 6 yaparsak sadece haftasonunu verir. break olan yer en sonu yazar ver dışarı çıkar
        switch (secim) {
            case 1:
                System.out.println("Pazartesi");
            case 2:
                System.out.println("salı");
            case 3:
                System.out.println("çarşmaba");
            case 4:
                System.out.println("Perşembe");
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("cumartesi");
            case 7:
                System.out.println("pazar");break;
            default:
                System.out.println("Yanlış seçim yaptınız."); //eğer DEFAULT EN BAŞTA OLACAKSA BREAK KULLANMAMIZ LAZIM.
        }
        //break imleci otomatik olarak buraya atar.
        System.out.println("switch'ten çıkıldı .");
    }
}