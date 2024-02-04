// n elemanlı dizide her bir elamandan kaç tane olduğunu bulan program
package org.example;
import java.util.Scanner;
public class example53 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir eleman sayısı giriniz");
        int n=input.nextInt();
        int[]sayi=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". sayıyı giriniz ");
            sayi[i]=input.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(sayi[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<n;j++){
                if(sayi[i]==sayi[j]){
                    s++;
                }
            }
            System.out.println("dizide "+ sayi[i] +"elemanından "+s + " tane vardır");
        }
    }
}
