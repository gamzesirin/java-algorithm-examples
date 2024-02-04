//a dizisinin elemanlarını ters sıra ve işaretle b dizine atayıp yazdıran program
package org.example;
import java.util.Scanner;
public class
example54 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n =input.nextInt();
        int []A=new int[n];
        int[]B=new int[n];
        for(int i=0;i<A.length;i++){
            System.out.print((i+1)+". sayı değerini giriniz ");
            A[i]=input.nextInt();
        }
        for (int i=0;i<B.length;i++){
            B[i]=A[n-i-1];
            if(B[i]>0){
                B[i]*=-1;
            }
            else if(B[i]<0){
                B[i]*=-1;
            }
            else{
                B[i]=B[i];
            }
        }
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}
