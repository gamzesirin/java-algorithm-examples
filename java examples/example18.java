package org.example;
import java.util.Scanner;
public class example18 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double s=input.nextDouble();
        double tam=(int)s;
        double o=s-tam;
        System.out.println("girilen sayının tam kısmı = "+tam+ " girilen sayının ondalıklı kısmı = "+o);
    }
}
