//girilen sayıya kadar olan asal sayıları bulan program
package org.example;
import java.util.Scanner;
public class example40 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n=input.nextInt();
        int s;
        for (int i=2;i<n;i++){
            s=0;
            for (int j=1;j<=i;j++){
                if(i%j==0){
                    s++;
                }
            }
            if(s==2){
                System.out.println(i);
            }
        }
    }
}
