package day07;

public class EscapeCharacters {
    public static void main(String[] args) {
        //escape characters

        // Öğretmen, "Çocuklar lütfen sessiz olur musunuz?" dedi.

        //NOT: cümle içinde  çift tırnak kullanılacaksa cümle içindeki  çift tırnağın başına ve
        // cümle bitimine ters slah gelir (\\)

        String metin = "Öğretmen,\"Çocuklar lütfen sessiz olur musunuz ?\" dedi.";

        System.out.println(metin);

        // dosya uzantısı yaparken ters slah (\) kullanacagın zaman iki tane (\\) yapıyorsun yoksa sistem hata verir.

        String klasorAdi = "c: \\Program Files \\Java";
        System.out.println(klasorAdi);

        // Örn: Dosya klasör uzantısı al yapıştır. orada her şey tek slah ama yapıştırınca çift slah olur.

        String  yol = "C:\\Users\\ncoil\\OneDrive\\DERSLER\\project2";
        System.out.println(yol);


    }
}
