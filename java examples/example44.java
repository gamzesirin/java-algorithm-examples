//1/1!+2/2!+3/3!+4/4!+... seri açılımını yapan program
package org.example;
import java.util.Scanner;
public class example44 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double toplam=0;

        for(int i=1;i<=n;i++){
            int f=1;
            for (int j=1;j<=i;j++){
               f*=j;
           }
            toplam+=(double)i/f;
        }
        System.out.println("toplam= "+toplam);
    }
}
