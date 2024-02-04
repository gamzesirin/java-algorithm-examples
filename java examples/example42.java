package org.example;
import java.util.Scanner;
public class example42 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        boolean asalmi=true;
        for (int i=2;i<s;i++){
            if(s%i==0){
                for (int j=2; j<i;j++){
                    if(i%j==0){
                        asalmi=false;
                    }
                }
                if(asalmi==true){
                    System.out.println(i);
                }
            }
        }

    }
}
