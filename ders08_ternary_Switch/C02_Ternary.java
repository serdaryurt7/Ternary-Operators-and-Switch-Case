package ders08_ternary_Switch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Ali";

        // Verilen iki metin birbiri ile aynıysa "Metinler Aynı", farklı ise "Metinler farklı" yazdırın

        if (str1.equals(str2)){

            System.out.println("Metinler Aynı");
        }
        else {

            System.out.println("Metinler Farklı");

        }

        System.out.println(str1.equals(str2) ? "Metinler Aynı" : "Metinler Farklı");

    }
}
