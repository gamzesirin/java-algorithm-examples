package org.example;
import java.util.Scanner;
public class example79 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n=input.nextInt();
        int[]dizi=new int[n];
        for(int i=0;i<n;i++){
            System.out.println((i+1)+".sayı" );
            dizi[i]=input.nextInt();
        }

        int [] dizi2=sirala(dizi);
        for(int i=0;i< dizi2.length;i++){
            System.out.print(dizi2[i]+ " ");
        }
    }
    public static int[]sirala(int []dizi){
        int[]dizi2=new int[dizi.length];
        int temp;
        for(int i=0;i< dizi2.length;i++){
            for(int j=0;j< dizi2.length;j++){
                if(dizi2[i]<dizi2[j]){
                    temp=dizi2[i];
                    dizi2[i]=dizi2[j];
                    dizi2[j]=temp;
                }
            }
        }
        return dizi2;
    }
}
