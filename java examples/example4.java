package org.example;
import java.util.Scanner;
public class example4 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        if(sayi==0){
            System.out.println("girdiğiniz sayı sıfırdır");
        }
        else if(sayi>0){
            System.out.println("girdiğiniz sayı pozitiftir");
        }
        else{
            System.out.println("girdiğiniz sayı negatiftir");
        }

    }
}
