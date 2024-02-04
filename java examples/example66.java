// a matrisinin her bir satırındaki negatif sayıların toplamını bulan program
package org.example;
import java.util.Scanner;
public class example66 {
    public static  void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n = input.nextInt();
        int[][]A=new int[n][n];
        int[]B=new int[n];

        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(" a matrisinin " + i + ". satırı " + j + ". sütunu ");
                A[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }


        for(int i=0;i<A.length;i++) {
            B[i]=0;
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < 0) {
                    B[i]+=A[i][j];
                }
            }
        }
        System.out.println();
        for(int i=0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }










    }
}

