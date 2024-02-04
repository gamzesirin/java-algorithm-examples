package org.example;
import java.util.Scanner;
public class example3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("bir sayı giriniz");
            sayi = input.nextInt();
        }while(sayi<0);
        if(sayi%2==0){
            System.out.println("girilen sayı çift sayıdır ");
        }
        else {
            System.out.println("girilen sayı tektir ");
        }


    }
}
