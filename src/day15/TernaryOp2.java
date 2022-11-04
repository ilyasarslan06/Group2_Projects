package day15;

public class TernaryOp2 {
    public static void main(String[] args) {
        //TERNARY OPERATÖRÜ

        int a=70;
        int b=90;
        // ef , else if ve else gibi düşünelim.
        //String mesaj = (a>b? "a büyüktür":a<b?"a küçüktür":"He ikiside eşittir.");
        System.out.println(a>b? "a büyüktür":a<b?"a küçüktür":"He ikiside eşittir.");

        String mesaj ="";
        if (a>b){
            mesaj="a büyüktür";
        } else if (a<b) {
            mesaj="a küçüktür";
        }else {
            mesaj="He ikiside eşittir.";

        }
        System.out.println(mesaj);
    }

}
