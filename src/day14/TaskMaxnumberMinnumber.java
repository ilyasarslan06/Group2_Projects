package day14;

public class TaskMaxnumberMinnumber {
    public static void main(String[] args) {

        //MİNİNUMM SAYIYI GÖSTERİNİZ.

        int S1 = 4, S2 = 3, S3 = 6;

        int Min = S3;

        if (S1 < Min) {
            Min = S1;

        }
        if (S2 < Min) {
            Min = S2;

        }
        System.out.println( Min);
    }
}
