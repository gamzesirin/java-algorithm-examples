//her bir sütunun elemanlarını küçükten büyüğe sıralayan program
package org.example;
import java.util.Scanner;

public class example63 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir n değeri giriniz");
        int n = input.nextInt();
        int[][] a = new int[n][n];
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a matrisinin " + i + " . satırı " + j + " . sütunu ");
                a[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(a[i][j]<a[k][j]){
                        temp=a[i][j];
                        a[i][j]=a[k][j];
                        a[k][j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}

