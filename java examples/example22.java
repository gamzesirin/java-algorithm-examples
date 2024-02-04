package org.example;
import java.util.Scanner;
public class example22 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n;
        do {
            System.out.println("lütfen bir sayı giriniz");
            n=input.nextInt();
        }while(n<100&&n>999);
        int bir=n%10;
        n=n/10;
        int on=n%10;
        n=n/10;
        int yuz=n%10;
        int ort=(bir+on+yuz)/3;
        System.out.println("girilen sayının basamaklarının ortalaması = "+ ort);
    }
}
