package org.example;
import java.util.Scanner;
public class example76 {
    public static void asalmı(int n){
        boolean asalmı=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                asalmı=false;
            }
        }
        if(asalmı==true){
            System.out.println(" girilen sayı asalsır");
        }
        else{
            System.out.println(" girilen sayı asal değildir");
        }
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s= input.nextInt();
        asalmı(s);
    }
}
