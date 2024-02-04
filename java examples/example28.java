package org.example;
import java.util.Scanner;
public class example28 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("çitf basamaklı bir sayı giriniz");
        int s = input.nextInt();
        int b=0;
        int toplam1=0;
        int toplam2=0;
        int sayac=0;
        while(s>0){
         b=s%10;
         s=s/10;
         sayac++;
        }
        if(sayac==1&&sayac==2){
            toplam1+=b;
        }
        else if(sayac==3&&sayac==4){
            toplam2+=b;
        }
        if(toplam1==toplam2){
            System.out.println("sayının ilk n basamğı toplamı son n basmağı toplamına eşittir");
        }
        else{
            System.out.println("sayının ilk n basamğı toplamı son n basmağı toplamına eşit değildir");
        }

    }
}
