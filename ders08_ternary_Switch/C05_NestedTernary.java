package ders08_ternary_Switch;

public class C05_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seçeneklerinden uygun olanı yazdırın.
        // Sayı pozitif değilse, 3 basamaklı veya 3 basamaklı değil seçeneklerinden uygun olanı yazdırın.

        int sayi =20;

        if (sayi>0){

            System.out.println(sayi % 2 == 0 ? "Çift Sayı" : "Çift Sayı Değil");

        }else {

            System.out.println(sayi<-99 && sayi> -1000 ? "Üç Basamaklı" : "Üç Basamaklı Değil");
        }


        String sonuc =  sayi>0
                        ?
                        sayi % 2 == 0 ? "Çift Sayı" : "Çift Sayı Değil"
                        :
                        sayi<-99 && sayi> -1000 ? "Üç Basamaklı" : "Üç Basamaklı Değil";
    }
}
