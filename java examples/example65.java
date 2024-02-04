// martiste kaç tane pozitif eleman olduğunu bulan program
package org.example;
import java.util.Scanner;
public class example65 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n=input.nextInt();
        int[][]A=new int[n][n];
        int s=0;

        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(" a matrisinin " + i + ". satırı " + j + ". sütunu ");
                A[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<A.length;i++){
            for (int j=0;j< A.length;j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] > 0) {
                    s++;
                }
            }
        }
        System.out.println(" girdiğiniz matriste "+ s + " tane pozitif eleman vardır ");
    }
}
