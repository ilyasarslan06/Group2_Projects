package day14;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        //Akış /flow) kontrol ifadeleri ;
        /*
            if      :
            switch  :
            for     :
            while   :
         */

        /*
                if statement( if kullanımları)
                1. if (condition(s)) statement ;

                2. if (condition(s)) {
                    statement1;
                    statement2;
                }

                 3. if(condition(s)) {
                       statament1;
                       ..;
                    }else {
                        "statement2;
                        ...;
                    }
                 4. if (condition(s)){
                    statement1;
                    ..;
                  }else if (condition(s)) {
                    statement2;
                    ....;
                  }

                  5.if (condition(s)){
                    statement1;
                    ..
                  }else if(condition(s)){
                    statemen2;
                    ..
                  }else {
                    statement3;
                    ..
                  }
                  6. if(condition(s)){
                      statement1;
                      ..
                  } else if(condition(s)){
                    statemen2;

                  }else if(condition(s)){
                    statemen3;

                  }else (condition(s)){
                    statemen4;
                    }

                   7. if(condition(s)){
                        statement1;
                        statement2;
                        ..
                   }if(condition(s)){
                        statement1;
                        statement2;

                    }if(condition(s)){
                        statement1;
                        statement2;
         */
        //TASK :1
        int x = 0;
        int y = 20;
        if (y == 20) {
            x = 5;

        }
        //System.out.println(x);

        //TASK :2
        int time = 50;
        double oran = 1.5;
        if (time > 40) {
            oran *= 1.5;
        }

        //TASK :3
        Boolean max = true;
        int fee = 50;
        if (max = true) {
            fee = 50;
        }
        //task4
        /*
        EĞER C DEĞİŞKENİ 100 EŞİT VEYA 100 DEN BÜYÜK İSE VE BE DEĞİŞKENİ 50 YE EŞİT İSE A DEĞİŞLENİNİ 20 DEĞERİNE ATAYINIZ.
         */

        int b = 0, c = 0;
        if (c>=100 & b==50){
            int a=20;

        }
        //task 5

        /*
        sıcaklık 70 ile 80 arasında ise ideal sıcaklık yazdıran bir ifadesi yazın.
         */
        int sicaklik = 50;
        if (sicaklik>70 & sicaklik<80 ){
            System.out.println("ideal sıcaklık");
        }else {
            System.out.println("ideal sıcaklık değil");
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz = ");
        int age = input.nextInt();


        if (age>=18){
            System.out.println("Oy kullanabilir.");
        }else {
            System.out.println("Oy kullanamaz. ");
        }
        int Sayi1=10, Sayi2=20, Sayi3=30;
        if (Sayi1>=Sayi2 & Sayi1>=Sayi3){
            System.out.println("En büyük sayıyı girdiniz cevap = "+Sayi1);
        } else if (Sayi2>=Sayi1 & Sayi2>=Sayi3) {
            System.out.println("En büyük sayıyı girdiniz cevap = "+Sayi2);
        }else {
            System.out.println("En büyük sayıyı girdiniz cevap = "+Sayi3);        }
    }

}
