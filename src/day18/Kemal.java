package day18;

import java.util.Scanner;

public class Kemal {
    public static int dikdortgenAlanHesapla(int _gelenuzunKenar, int gelenKisaKenar) {
        int alanHesapla = _gelenuzunKenar * gelenKisaKenar;
        return alanHesapla;
    }
    public static int faktoriyelHesaplama(int _faktoriyelHesaplanacakSayi){

        int sonuc=_faktoriyelHesaplanacakSayi;
        if (_faktoriyelHesaplanacakSayi==0){return 1;
        }
        for (int i = _faktoriyelHesaplanacakSayi; i >0 ; i--) {
            if ((i-1)==0){ break;
            }else {
             sonuc=sonuc*(i-1);

            }
        }
        return sonuc;
    }

    public static boolean validasyon(int gelenKisaKenar, int _gelenuzunKenar) {
        boolean islemDogrumu = false;
        if (gelenKisaKenar > _gelenuzunKenar) {
            islemDogrumu = false;
        } else if (_gelenuzunKenar == gelenKisaKenar) {
            islemDogrumu = false;
        } else {
            islemDogrumu = true;
        }
        return islemDogrumu;
    }


    public static void dikdortgenAlanHesapla2(int _gelenuzunKenar,int gelenKisaKenar) {
        boolean islemDogrumu=validasyon( gelenKisaKenar, _gelenuzunKenar);
        if (islemDogrumu){
            int alanHesapla=_gelenuzunKenar*gelenKisaKenar;
            System.out.println("sonuç = " +alanHesapla);
        }else {
            System.out.println("yarrayiring");
        }

    }

    public static void GenelHesap(String girilenSayi, Scanner input){
        switch (girilenSayi){
            case"1":
                System.out.print("Kısa Kenar Giriniz : ");
                int kisaKenar = input.nextInt();
                System.out.print("Uzun Kenar Giriniz : ");
                int uzunKenar = input.nextInt();

                dikdortgenAlanHesapla2(uzunKenar,kisaKenar);

                break;
            case"2":
                System.out.println("Karenin kenar uzunluğunu giriniz = ");
                int kareKenar = input.nextInt();
                int kareK=kareKenar*4;
                System.out.println("Sonuç = "+kareK);
                break;
            case"3":
                System.out.println("Dairenin yarıçapını giriniz = ");
                int daireninYariCapi = input.nextInt();
                double daireAlani=Math.PI*(daireninYariCapi*daireninYariCapi);
                System.out.println("Sonuç = "+daireAlani);
                break;
            case "4":
                System.out.println("Faktöriyel için değer giriniz : ");
               int faktoriyelHesaplanacakSayi=input.nextInt();
                System.out.println("sonuc = "+faktoriyelHesaplama(faktoriyelHesaplanacakSayi));
                break;
                default:
                System.out.println("yanlış giriş yaptınız");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("LÜtfen bir sayı giriniz : ");
        String girilenSayi = input.nextLine();
        GenelHesap(girilenSayi,input);

        }
    }


