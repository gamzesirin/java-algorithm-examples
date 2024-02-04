//t=1/2+2/4+3/6+4/8+... seri açılımını hesaplayan program
package org.example;
import java.util.Scanner;
public class example37 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n= input.nextInt();
        double toplam=0;
        for (int i=1;i<=n;i++){
            toplam+=(double)i/(2*i);
        }
        System.out.println("toplam = "+toplam);



    }
}
