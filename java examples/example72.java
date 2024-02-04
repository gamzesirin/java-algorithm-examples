package org.example;
import java.util.Scanner;
public class example72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = input.nextInt();
        int b=0;
        int toplam = 0;
        int s=0;
        double ort;
        while (sayi > 0) {
            b = sayi % 10;
            sayi = sayi / 10;
            toplam += b;
            s++;
        }
        ort=toplam/s;
        System.out.println("girilen sayının basamaklarının ortalaması "+ort );
    }
}
