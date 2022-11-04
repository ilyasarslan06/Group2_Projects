package day18;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String secim =showMainMenu().toUpperCase();
        switch (secim){
            case "1":
                String mathSecim=showSubMenuMath();
                break;
            case "2":
                String geoSecim=showSubMenuGeoCounting();
                break;
            case "Q":
                System.out.println("Programdan çıkıldı");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }

     }

    public static String showMainMenu(){// dönüş tipi String (nextline)olduğu için String dönecektir.
        System.out.println("Ana Menü");
        System.out.println("1.Matematik İşlemleri");
        System.out.println("2.Alan ve Çevre Hesaplama");
        System.out.println("Q.Çıkış");
        System.out.print("Seçiniz = ");
        Scanner input = new Scanner(System.in);
        String choice=input.nextLine();
        return choice;
    }
    public static String showSubMenuMath(){
        System.out.println("Alt Menü| Matematik İşlemleri");
        System.out.println("1.Faktöriyel Hesaplama");
        System.out.println("2.Mutlak Değer Alma");
        System.out.println("Q.Çıkış");
        //Scanner input = new Scanner(System.in);
        //String choice=input.nextLine();
       // return choice;
        return new Scanner(System.in).nextLine();
    }
    public static String showSubMenuGeoCounting(){
        System.out.println("Alt Menü| Alan ve Çevre Hesaplama");
        System.out.println("1.Dikdörtgen");
        System.out.println("2.Kare");
        System.out.println("3.Daire");
        System.out.println("Q.Çıkış");
        return new Scanner(System.in).nextLine();
    }
}
