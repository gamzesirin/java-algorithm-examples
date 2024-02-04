// t=2/3-3/5+4/7-5/9+... seri toplamını hesaplayan program
package org.example;
import java.util.Scanner;
public class example34 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir terim sayısı giriniz");
        int n = input.nextInt();
        double toplam=0;
        for (int i=1;i<=n;i++){
            toplam+=Math.pow(-1,i+1)*(i+1)/(2*i+1);
        }
        System.out.println("toplam= "+toplam);




    }
}
