//t=2/3-3/8+4/15-5/24+... seri açılımıını yapan program
package org.example;
import java.util.Scanner;
public class example39 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("terim sayısı giriniz");
        int n=input.nextInt();
        int s=2;
        double toplam=0;
        for(int i=1;i<=n;i++){
            toplam+=(double)(i+1)/((s*i)+i)*Math.pow(-1,i+1);
            s++;
        }
        System.out.println("toplam= "+toplam);

    }
}
