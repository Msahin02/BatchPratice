package ders;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int a [][] = new int[3][2];//[[0,0],[0,0],[0,0]]

        //Multidimensional Array lere nasil eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //Multidimensional arrayleri console a yazdirmak icin toString() methodu degil, deepToString() methodunu kullaniriz


        String students [][] = { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} };
        System.out.println(a[1][1]);//45
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;
        //{ {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} }
        for ( String [] w : students ) {
            sum=sum+ w.length;
        }
        System.out.println(sum);
        int arr[ ][]  =new int[3][4];
        System.out.println(Arrays.deepToString(arr));
        arr[0][1]=2;
        System.out.println(Arrays.deepToString(arr));


        int sayi1[][]={{1,2},{4,5},{7,0,8}};
        System.out.println(Arrays.deepToString(sayi1));








    }
}
