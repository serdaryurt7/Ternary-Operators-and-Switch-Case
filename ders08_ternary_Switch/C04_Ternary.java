package ders08_ternary_Switch;

public class C04_Ternary {
    public static void main(String[] args) {

        // Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        // ucgen eşkenar ise "Eşkenar Üçgen" yazdırın, değilse "Eşkenar Değil" yazdırın.

        int kenar1 = 10;
        int kenar2 = 10;
        int kenar3 = 10;

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 && kenar1 == kenar2 && kenar2 == kenar3 ? "Eşkenar Üçgen" : "Eşkenar Değil");

        //Kullanıcıdan iki sayı alın ve büyük olmayan sayıyı yazdırın.

        int sayi1 = 11;
        int sayi2 = 11;

        System.out.println(sayi2>sayi1 ? sayi1 : sayi2);



    }
}
