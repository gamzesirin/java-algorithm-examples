package org.example;
import java.util.Scanner;
public class example20 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz ");
        int n=input.nextInt();
        int toplam=0;
        for(int i=1;i<=n;i++){
            System.out.println("pozitif tamsayı giriiniz");
            int s=input.nextInt();
            toplam+=s%10;
        }
        System.out.println("girilen sayıların birler basmaklarının toplamı = "+toplam);
    }
}

