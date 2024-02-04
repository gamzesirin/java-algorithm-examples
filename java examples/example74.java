package org.example;

public class example74 {
    public static void yıldızyazdır(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        yıldızyazdır(10);

    }
}
