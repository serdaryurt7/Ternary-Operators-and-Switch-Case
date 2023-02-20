package ders08_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        // Ternary operatörü tek başına kullanılamaz. Ternary bize bir sonuç üretir.
        // Bu sonucu ya direk yazdırmalı veya bir değişkene atamalıyız.
        // Ürettiği sonuca göre değişken tanımlanır.


        int a = 5;
        String sonuc = a % 2 == 0 ? "Çift Sayı" : "Tek Sayı";

        // Ternary 'nin sonucunu bir değişkene atayacaksak true ve false durumlarında üretilecek sonucun aynı veri türüne uygun olması gerekir.

        // Burada hiçlik koyarak 2*a değerini stringleştiriyoruz.

        String sonuc2 = a > 10 ? "Büyük Sayı" : "" + 2*a;

        // Ternary' i Sout içinde kullanırsak sonuçların data türünün aynı olması şart olmaz.

        System.out.println(a > 10 ? "Büyük Sayı" : "" + 2*a);

    }
}
