package org.example;
import java.util.Scanner;
public class example7 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String txt=input.nextLine();
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        for (int i=0;i<s;i++){
            System.out.println(txt);
        }
    }
}