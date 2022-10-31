package day12;

public class IfTekrarınTekrarı {
    public static void main(String[] args) {
        int d1 = 2;
        int d2 = 3;

        if (d1>d2){
            System.out.println("d1 büyüktür.");
            // {} blok mutlaka kullanılması lazım çünkü blok olduğu zamana oradaki tüm şartlar çalışır.
        }else if (d1==d2) {
            System.out.println("d1 ve d2 eşitiir.");
        }else {
            System.out.println("d1 küçüktür.");
        }
    }
}
