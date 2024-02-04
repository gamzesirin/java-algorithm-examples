//e üzeri x in seri açılımını yapan program
package org.example;
import java.util.Scanner;
public class example32 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n= input.nextInt();
        System.out.println("bir x değeri giriniz");
        int x=input.nextInt();
        double toplam=1;
        int f=1;
        for (int i=1;i<n;i++){
            f*=i;
            toplam+=Math.pow(x,i)/f;
        }
        System.out.println(toplam);
    }
}
