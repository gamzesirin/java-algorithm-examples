package org.example;
import java.util.Scanner;
public class example25 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n sayısı giriniz");
        int n = input.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (i*i+j*j==n){
                    System.out.println(n + " sayısı " +i+ " ve "+ j +" nin kareleri toplamı olarak yazılır");
                }
            }
        }
    }
}
