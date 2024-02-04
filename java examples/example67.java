// a matrisindeki her bir stırdaki negatif elamanları yazan program
package org.example;

import java.util.Scanner;

public class example67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n = input.nextInt();
        int[][] A = new int[n][n];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(" a matrisinin " + i + ". satırı " + j + ". sütunu ");
                A[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print (" a martisindeki negatif elemanlar = ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < 0) {
                    System.out.print(A[i][j]+ " ");
                }
            }

        }

    }
}

