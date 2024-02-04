package org.example;
import java.util.Scanner;
public class example19 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        int k;
        while(s!=0) {
            k = s % 10;
            s = s / 10;
            System.out.print(k);
        }
    }
}
