package org.example;
import java.util.Scanner;
public class example9 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("metre cinsinden bir uzunluk giriniz");
        int uzunluk=input.nextInt();
        System.out.println("bir seçim yapınız 1-mm 2-cm 3-dm 4-km");
        int secim=input.nextInt();
        int sonuc;
        if(secim==1){
            sonuc=uzunluk*1000;
        }
        else if(secim==2){
            sonuc=uzunluk*100;
        }
        else if(secim==3){
            sonuc=uzunluk*10;
        }
        else{
            sonuc=uzunluk/1000;
        }
        System.out.println("sonuç="+sonuc);

    }
}
