package org.example;
import java.util.Scanner;
public class example21 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("kesrin payını giriniz");
        int pay=input.nextInt();
        System.out.println("kesrin paydasını giriniz");
        int payda=input.nextInt();
        int kesir=pay/payda;
        System.out.println("istediğiniz basamak değerini giriniz: 1- birler basamağı 2- onlarr basamağı 3- yüzler basamağı");
        int ib=input.nextInt();
        int b=0;
        if (ib==1) {
            b = kesir % 10;
            System.out.println("istediğiniz basamağın değeri = " + b);
        }
        kesir=kesir/10;
        if(ib==2) {
            b = kesir % 10;
            System.out.println("istediğiniz basamağın değeri = " + b);
        }
        kesir=kesir/10;
        if(ib==3){
            System.out.println("istediğiniz basamağın değeri = " + b);
        }


    }
}
