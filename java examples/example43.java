//girilen sayının tam bölenlerini bulan program
package org.example;
import java.util.Scanner;
public class example43 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        for (int i=1;i<=s;i++){
            if(s%i==0){
                System.out.println(i);
            }
        }
    }
}
