package org.example;
import java.util.Scanner;
public class example26 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int ts=input.nextInt();
        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                ts=10*i+j;
                if(ts%i==0&&ts%j==0){
                    System.out.println(ts);
                }
            }
        }

    }
}

