package org.example;
import java.util.Scanner;
public class example52 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        int toplam=0;
        int temp=s;
        while(temp>0){
           int b=temp%10;
           int f=1;
            for(int i=1;i<=b;i++){
                f*=i;
            }
            toplam+=f;
            temp=temp/10;
        }
        if(toplam==s){
            System.out.println("girilen sayı faktorion sayıdır");
        }
        else{
            System.out.println("girilen sayı faktorion sayı değildir");
        }
    }
}
