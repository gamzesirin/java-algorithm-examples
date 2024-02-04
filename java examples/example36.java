//t=1/2+2/3+3/4+4/5+.... seri açılımını hesaplayan program
package org.example;
import java.util.Scanner;
public class
example36 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        double toplam=0;
        for(int i=1;i<=n;i++){
            toplam+=(double)i/(i+1);
        }
        System.out.println("toplam= "+toplam);
    }
}
