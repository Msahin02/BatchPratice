package practice03;

import java.util.Scanner;

public class C04WhileLoop {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz...");

        int sayi = scan.nextInt();



        while (sayi%10!=0){
            System.out.print(sayi+ " ");

            sayi++;

        }










    }
}
