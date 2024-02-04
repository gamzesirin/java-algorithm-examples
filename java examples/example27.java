package org.example;
import java.util.Scanner;
public class example27 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=input.nextInt();
        int b;
        int toplam=0;
        int s=0;
        while(sayi>0) {
            b = sayi % 10;
            sayi = sayi / 10;
            toplam+=b;
            s++;
        }
        if(toplam==s){
            System.out.println("girilen sayının basamakları toplamı ile basamak sayısı eşittir ");
        }
        else{
            System.out.println("girilen sayının basamakları toplamı ile basamak sayısı eşit değildir ");
        }

    }
}
