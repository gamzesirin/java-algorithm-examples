package org.example;

import java.util.Random;
import java.util.Scanner;

public class example77 {
    public static int[][]rassaluret(int[][]dizi){
        Scanner input=new Scanner(System.in);
        System.out.println("bir üst sınır giriniz");
        int ub= input.nextInt();
        System.out.println("bir n değeri giriniz");
        int n=input.nextInt();
        int[][]array=new int[n][n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=(int)r.nextInt(ub);
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        return array;
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n=input.nextInt();
        int [][]array=new int[n][n];
        rassaluret(array);

    }
}
