//1/2+2/5+3/10+4/17+... seri açılımını yapan program
package org.example;
import java.util.Scanner;
public class example38 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double toplam=0;
        int s=1;
        for (int i=1;i<=n;i++) {
            toplam += (double) i / (i*s + 1);
            s++;
        }
        System.out.println("toplam= "+toplam);
    }
}
