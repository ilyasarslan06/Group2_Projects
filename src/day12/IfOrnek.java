package day12;

public class IfOrnek {
    public static void main(String[] args) {
        int yas = 70;
// yas değerini değiştir bak :)
        if (yas<6){
            System.out.println("Merhaba bebek!");
        } else if (yas<13) {
            System.out.println("Merhaba çcocuk");
        }else if (yas<=18) {
            System.out.println("Merhaba Genç");
        } else if (yas<40) {
            System.out.println("Merhaba moyuk");
        } else if (yas>60) {
            System.out.println("Merhaba Dayı");
        }else {
            System.out.println("Merhaba Rahmetli");
        }
    }
}
