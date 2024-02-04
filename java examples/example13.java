package org.example;
import java.util.Scanner;
public class example13 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("tabanı giriniz");
        int taban=input.nextInt();
        System.out.println("üssü giriniz");
        int us=input.nextInt();
        int sonuc=1;
        for (int i=1;i<=us;i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);
    }
}
