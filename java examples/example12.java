package org.example;
import java.util.Scanner;
public class example12 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        System.out.println("bir sayı giriniz");
        int s2=input.nextInt();
        int sonuc=0;
        for (int i=1;i<=s2;i++){
            sonuc+=s;
        }
        System.out.println("girilen iki sayının çarpımı="+sonuc);
    }



}
