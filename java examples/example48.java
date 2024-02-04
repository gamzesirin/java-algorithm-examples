//girilen sayıyı basamaklarına ayırıp basamak değerini gösteren program
package org.example;
import java.util.Scanner ;
public class example48 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        String sayi=input.nextLine();
        for(int i=sayi.length()-1;i>=0;i--){
            System.out.println((int)Math.pow(10,(sayi.length()-1-i))+ " --> "+sayi.charAt(i));
        }
    }
}