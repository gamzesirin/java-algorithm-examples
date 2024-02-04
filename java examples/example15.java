package org.example;
import java.util.Scanner;
public class example15 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int s1=input.nextInt();
        System.out.println("2.sayıyı giriniz");
        int s2=input.nextInt();
        int temp=0;
        temp=s2;
        s2=s1;
        s1=temp;
        System.out.println("ilk sayı = "+s1+" ikinci sayı = "+s2);


    }
}
