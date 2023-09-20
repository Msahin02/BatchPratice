package ders;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {



        //Array nasil olusturulur?
        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //toString() methodunu kullanmadan sadece array ismini yazdirirsaniz java size o Array in adresini verir

        //Array e eleman ekleme nasil yapilir?
        stdNames[2] = "Ali";
        stdNames[1] = "Enes";
        stdNames[3] = "Azize";
        stdNames[4] = "Zafer";
        stdNames[0] = "Fatma";
        // stdNames [5] ="Bilgin";

        System.out.println(Arrays.toString(stdNames));//[Fatma, Enes, Ali, Azize, Zafer]

        //Array den specific bir eleman nasil alinir?
        System.out.println(stdNames[1]);//Enes

         String isim []={"Ali","Enes","Azize","Zafer","Fatma"};
        for (String w:isim) {
            System.out.print(w+ " ");
        }

        //Example: int array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //       bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz








    }
}
