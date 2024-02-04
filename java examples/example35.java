//t=5/3+6/4+7/5+8/6+.... seri toplamını hesaplayan program
package org.example;
import java.util.Scanner;
public class example35 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n=input.nextInt();
        double toplam=0;
        for(int i=1;i<=n;i++){
            toplam+=(double)((i+4)/(i+2));
        }
        System.out.println("toplam= "+toplam);
    }
}