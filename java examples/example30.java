//cosx fonksiyonunun seri açılımını bulan program
package org.example;
import java.util.Scanner;
public class
example30 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir açı değeri giriniz");
        double x=input.nextInt();
        x=Math.toRadians(x);
        System.out.println("terim sayısını giriniz");
        double n =input.nextInt();
        double toplam=1;
        for (double i=1;i<=n-1;i++){
            int f =1;
            for (double j=1;j<=2*i;j++){
                f*=j;
            }
            toplam+=Math.pow(-1,i)*(Math.pow(x,2*i)/f);
        }
        System.out.println(toplam);


    }
}
