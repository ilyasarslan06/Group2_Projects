package day15;


import java.util.Scanner;

public class Task39TrafikLambasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Renk Seçiniz [K,S,Y] : ");
        String renk = input.next();
        renk=renk.toLowerCase();

        switch (renk){
            case "k":
                System.out.println("kırmızı");break;
            case "s":
                System.out.println("Sarı");break;
            case "y":
                System.out.println("Yeşil");break;
            default:
                System.out.println("HATALI İŞLEM YAPTINIZ");break;
        }
    }
}
