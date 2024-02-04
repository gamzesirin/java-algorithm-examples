package org.example;
import java.util.Scanner;
public class example5 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("bir sayı giriniz");
            sayi = input.nextInt();
        }while(sayi<0);

        int basamak;
        int toplam=0;

        while(sayi!=0) {
            basamak = sayi % 10;
            sayi = sayi / 10;
            toplam+=basamak;
        }
        System.out.print(" girilen sayının basmakları toplamı ="+toplam);

    }
}
