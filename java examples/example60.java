package org.example;
import java.util.Scanner;
public class example60 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("doğum gününüzü giriniz");
        int gün =input.nextInt();
        System.out.println("doğum ayınızı giriniz");
        int ay=input.nextInt();
        System.out.println("doğum yılınızı giriniz");
        int yıl =input.nextInt();
        int[]aylar={1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i=0;i<aylar.length;i++){
            if(ay==aylar[0]){
                System.out.println("burcunuz oğlak ");
            }
            else if(ay==aylar[1]){
                System.out.println("burcunuz kova");
            }
            else if(ay==aylar[2]){
                System.out.println("burcunuz balık");
            }
            else if(ay==aylar[3]){
                System.out.println("burcunuz koç");
            }
            else if(ay==aylar[4]){
                System.out.println("burcunuz boğa");
            }
            else if(ay==aylar[5]){
                System.out.println("burcunuz ikizler");
            }
            else if(ay==aylar[6]){
                System.out.println("burcunuz yengeç");
            }
            else if(ay==aylar[7]){
                System.out.println("burcunuz aslan");
            }
            else if(ay==aylar[8]){
                System.out.println("burcunuz başak");
            }
            else if(ay==aylar[9]){
                System.out.println("burcunuz terazi");
            }
            else if(ay==aylar[10]){
                System.out.println("burcunuz akrep");
            }
            else {
                System.out.println("burcunuz yay");
            }

        }





    }
}
