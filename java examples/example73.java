package org.example;
import java.util.Scanner;
public class example73 {
    public static void yıldızyazdır(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0&&j%2==0){
                    System.out.print("*");
                }
                else if (i%2==0&&j%2!=0){
                    System.out.print(" ");
                }
                else if (i%2!=0&&j%2==0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        yıldızyazdır(5);
    }
}
