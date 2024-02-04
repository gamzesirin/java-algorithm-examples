package org.example;
import java.util.Scanner;
public class example23 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=input.nextInt();
        int b;
        int sayac=0;
        while(sayi>0){
            b=sayi%10;
            sayi=sayi/10;
            System.out.println(b*Math.pow(10,sayac));
            sayac++;
        }
    }
}
