package practice02;

import java.util.Scanner;

public class C02NestedIf {
    public static void main(String[] args) {
/*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen Bir sayi giriniz");

        int numara = scan.nextInt();


        if(numara<0){
            System.out.println("Negatif Sayi");

        }else{
            if(numara<10) {
                System.out.println("Rakam");
            }else{
                System.out.println("pozitif sayi");
            }

        }



    }
}
