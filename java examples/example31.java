//ln2 nin seri açılımını bulan program
package org.example;
import java.util.Scanner;
public class example31 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n=input.nextInt();
        double toplam=0;
        for(int i=0; i<=n-1;i++){
            toplam+=(double)1/((2*i+1)*(2*i+2));
        }
        System.out.println(toplam);
    }
}