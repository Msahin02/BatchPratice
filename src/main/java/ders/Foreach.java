package ders;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {


        /*
        for (VeriTipi değişkenAdı : veriYapısı){
        code ..
        code..
        code...}

        for (int i : ages ){
        System.out.println(ages);



         */

       // String isimler[]= {"Enes","Yakup","Bilal","Yasin"};
        String isimler[]= new String[4];

        isimler[0]="Enes";
        isimler[1]="Yakup";
        isimler[2]="Bilal";
        isimler[3]="Yasin";


        int sum=0;

        for (String w:isimler) {
            sum=sum+w.length();

        }
        System.out.println(sum);
        System.out.println(Arrays.toString(isimler));





        //**************************************

        int [][] ikiBoyutluDizi = new int[][]{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
      //  System.out.println(Arrays.deepToString(ikiBoyutluDizi));

        for (int[] i :ikiBoyutluDizi) {
            for(int j:i) {
                System.out.print(j + " ");
            }
            System.out.println();

        }


        //**********************

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?

        int numbers[] = {12, 3, -3, 5, 23};


        for (int w : numbers) {

            if (w < 5) {
                System.out.print(w + " ");
            }
        }







    }
}
