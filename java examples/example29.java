package org.example;
import java.util.Scanner;
public class example29 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=input.nextInt();
        int s=0;
        int b=sayi-3;
        for (int i=1;i<=b;i++){
            for (int j=i;j<=b;j++){
                for (int k=j;k<=b;k++){
                    for (int l=k;l<=k;l++){
                        if(i+j+k+l==sayi){
                            s++;
                            System.out.println(i+ " "+ j+" "+k+" "+l);
                        }
                    }
                }
            }
        }
        System.out.println(s+ " farklı şekilde 4 tam sayının toplamı olarak yazılabilir");
    }


}
