package org.example;
import java.util.Scanner;
public class example11 {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("kilonuzu giriniz");
        int kilo=input.nextInt();
        System.out.println("boyunuzu giriniz");
        double boy=input.nextInt();
        double vki=kilo/boy*boy;
        if(vki<18.5){
            System.out.println("zayıf");
        }
        else if(vki>=18.5&&vki<25){
            System.out.println("normal");
        }
        else if(vki>=25&&vki<30){
            System.out.println("fazla");
        }
        else if(vki>=30&&vki<35){
            System.out.println(" 1.derece obez");
        }
        else if(vki>=35&&vki<40){
            System.out.println("2.derece obez");
        }
        else{
            System.out.println("3.derce obez");
        }


    }
}
