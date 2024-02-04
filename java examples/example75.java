package org.example;
import java.util.Scanner;
public class example75 {
    public static void karelertoplamı(int n){
       int toplam=0;
        for (int i=1;i<=n;i++){
            toplam+=Math.pow(i,2);
        }
        System.out.println(" 1 den "+ n + " e kadar olan sayıların toplamı = "+ toplam);
    }
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println(" bir sayı giriniz");
        int n = input.nextInt();
        karelertoplamı(n);
    }
}
