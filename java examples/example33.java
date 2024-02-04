//brothers formülü hesaplayan program
package org.example;
import java.util.Scanner;
public class example33 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayı giriniz");
        int n=input.nextInt();
        double toplam=2;
        int f=1;
        for (int i=1;i<=n;i++){
            f*=2*i+1;
            toplam+=(double)(2*i+2)/f;
        }
        System.out.println("toplam ="+toplam);
    }
}
