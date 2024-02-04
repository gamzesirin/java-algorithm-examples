package org.example;
import java.util.Scanner;
public class example6 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n = input.nextInt();
        int ct=0;
        int tt=0;
        int tc=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                tt+=i;
                tc*=i;
            }
            else{
                ct+=Math.pow(i,2);
            }
        }
        System.out.println(" 1 den girilen sayıya kadar olan tek sayıların toplamı = "+tt+ " çarpımı= "+tc+" çift sayıların karelerinin toplamı = "+ct);
    }
}
