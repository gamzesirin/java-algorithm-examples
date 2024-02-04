package org.example;
import java.util.Scanner;
public class example10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir seçim yapınız  1-yaz 2-ilkbahar 3-sonbahar 4-kış");
        int secim=input.nextInt();
        if(secim==1){
            System.out.println(" haziran temmuz ağustos");
        }
        else if(secim==2){
            System.out.println(" mart nisan mayıs ");
        }
        else if(secim==3){
            System.out.println(" eylül ekim kasım ");
        }
        else{
            System.out.println(" aralık ocak şubat ");
        }



    }
}
