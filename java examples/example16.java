package org.example;
import java.util.Scanner;
public class example16 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        float s=input.nextFloat();
        if(s==(int)s){
            System.out.println("girilen sayı tamsayıdır");
        }
        else{
            System.out.println("girilen sayı tam sayı değildir ");
        }
    }
}
