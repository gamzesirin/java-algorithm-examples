package org.example;
import java.util.Scanner;
public class example8 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n=input.nextInt();
        System.out.println("bir yüzde değeri giriniz");
        int yuzde=input.nextInt();
        double sonuc=0;
        sonuc+=(double)n*yuzde/100;
        System.out.println(sonuc);
    }
}
