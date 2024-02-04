package org.example;
import java.util.Scanner;
public class example17 {
    public static void main(String[]args) {
    Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double s=input.nextDouble();
        if(s%1==0){
            System.out.println("tam sayı girdiniz");
        }
        else{
            System.out.println("ondalıklı sayı girdiniz");
        }




    }
}
