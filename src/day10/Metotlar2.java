package day10;

public class Metotlar2 {
    public static void main(String[] args) {
        kareninCevresi(9);
        kareninCevresi(8);
        kareninCevresi(7);
        kareninCevresi(6);
        kareninCevresi(5);
        kareninCevresi(4);
        kareninCevresi(3);
    }

    public static void kareninCevresi(int kenar){
        int cevre =4*kenar;
        System.out.println("Karenin Çevresi = "+cevre);
        //kareninCevresi metodonu ana scorp {} içinde tanımlamamız varlığını söylemezsk olmaz. yani main metoduna bak.
    }
}
