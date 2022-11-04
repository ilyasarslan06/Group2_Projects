package day17;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("KPH\t\t MPH");
        for (double i = 60; i <=130 ; i+=10) {
            double formula=i*0.6214;
            System.out.printf("%5.0f\t%5.1f",i,formula);
            System.out.println(" ");

        }
    }
}
