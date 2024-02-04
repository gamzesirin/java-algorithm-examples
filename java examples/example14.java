package org.example;
import java.util.Scanner;
public class example14 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bölünecek sayıyı giriniz");
        double s1=input.nextDouble();
        System.out.println("bölecek sayıyı giriniz");
        double s2=input.nextDouble();
        double k=0;
        k=s1%s2;
        s1=s1/s2;
        System.out.println("girilen iki sayının böümünden kalan = "+k+" bölüm = "+s1);
    }
}
