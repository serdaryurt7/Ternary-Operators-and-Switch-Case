package ders08_ternary_Switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        // kullanıcıdan bir sayı alın, sayı pozitif ise 2 katını yazdır, sayı pozitif değilse sayıya 10 ekleyip yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");

        double sayi = scanner.nextDouble();

        if (sayi<0){
            System.out.println(sayi + 10);
        }
        else {
            System.out.println(sayi * 2);
        }


        System.out.println(sayi<0 ? sayi+10 : sayi*2);


    }
}
