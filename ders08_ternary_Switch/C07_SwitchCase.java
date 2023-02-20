package ders08_ternary_Switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        // J : Java
        // D : Development
        // K : Kit
        // Kullanıcıdan bir harf alın, eğer harf J, D, K dan birisi ise yukarıdaki kelimeleri yazdırın, değilse Geçersiz harf yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Harf Giriniz: ");
        char harf = scanner.next().charAt(0);

        switch (harf){

            case 'J' :
            case 'j' :
                System.out.println("Java");
            break;

            case 'D' :
            case 'd' :
                System.out.println("Development");
            break;

            case 'K' :
            case 'k' :
                System.out.println("Kit");
                break;

            default:
                System.out.println("Geçersiz Harf");

        }
    }
}
