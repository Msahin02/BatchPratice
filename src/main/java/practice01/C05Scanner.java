package practice01;


import java.util.Scanner;

public class C05Scanner {

    public static void main(String[] args) {

        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */


        //1.adım Scanner objesi olurturmak


        Scanner scan = new Scanner(System.in);
    //kullanıcıya mesaj verelim

        System.out.println("Lütfen karesini bulmak istediğiniz sayıyı giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi);

        System.out.println(sayi*sayi);

    }
}
