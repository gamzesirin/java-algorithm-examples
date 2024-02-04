//bilgisaarın 1-49 arsında ürettiği 6 sayıdan kaç tanesinin doğru tahmin edildiğini bulan program
package org.example;
import java.util.Random;
import java.util.Scanner;
public class example46 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Random r=new Random();
        int[]randomsayi=new int[6];
        int[]tahmin=new int[6];
        for(int i=0;i<randomsayi.length;i++){
            randomsayi[i]=r.nextInt(49)+1;
            System.out.print((i+1)+". sayı "+ randomsayi[i]+" ");
        }
        System.out.println();
        for(int i=0;i<tahmin.length;i++){
            System.out.print((i+1)+" . tahmin");
            tahmin[i]=input.nextInt();
        }
        System.out.println();
        int s=0;
        for (int i=0;i<tahmin.length;i++){
            for (int j=0;j<randomsayi.length;j++){
                if(tahmin[i]==randomsayi[j]){
                    s++;
                }
            }
        }
        System.out.println(s+" tane doğru tahmin yaptınız");
    }
}
