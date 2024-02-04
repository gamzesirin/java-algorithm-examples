//1-1/3+1/5-1/7+1/9-.... seri açılımını yapan program
package org.example;
import java.util.Scanner;
public class example45 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir terim sayısı giriniz");
        int n =input.nextInt();
        double toplam=1;
        for (int i=1;i<=n;i++){
            toplam+=Math.pow(-1,i)*1/(2*i+1);
        }
        System.out.println("toplam= "+toplam);

    }
}
