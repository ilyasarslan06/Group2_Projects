package day17;

public class ForLoop1 {
    public static void main(String[] args) {
        // 5 ten 140 e kadar tek sayıları yazdırınız. her 10 sayıda 1 satır aşağıya yazdır.
        int enterSayaci=0;
        for (int i = 5; i <140 ; i+=2) {
            System.out.print(i+"\t");
            if (++enterSayaci%10==0){
                System.out.println();
            }
        }
    }
}
