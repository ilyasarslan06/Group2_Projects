package day16;

public class Lopps7 {
    public static void main(String[] args) {
        //TODO : 1'den 20'a kadar olan sayıların ortalamasını bulan bir java programı yazınız.
        int toplam=0;
        float ort=0.0F; //ortalama sonucu tam çıkmayabilir bu yüzden float veya double tanımlıyoruz
        for (int i = 1; i <=20 ; i++) {
            toplam=toplam+i;

        }System.out.println("TOPLAM = "+toplam);
        System.out.println("ORTALAMA = "+toplam/20f);
    }
}
