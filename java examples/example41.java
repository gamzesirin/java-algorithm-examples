//girilen sayının iki baamağının da asal olup olmadığını kontrol eden program
package org.example;
import java.util.Scanner;
public class example41 {
    public static void main (String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int s=input.nextInt();
        int k;
        boolean asalmi =true;
        while (s > 0) {
            k=s%10;
            s=s/10;
            for(int i=2;i<k;i++){
                if(k%i==0){
                    asalmi=false;
                }
            }
        }
        if(asalmi==true){
            System.out.println("girilen sayının iki basamğı da asaldır");
        }
        else{
            System.out.println("girilen sayının iki basağı asal değildir");
        }
    }
}
