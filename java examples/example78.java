package org.example;
import java.util.Scanner;
public class example78 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("şirket adedini giriniz");
        int n=input.nextInt();
        int[][]sirkar=new int[n][12];

        for(int i=0;i<n;i++){
            for(int j=0;j<12;j++){
                System.out.println((i+1)+". satır"+ (j+1)+" .sütun");
                sirkar[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(sirkar[i][j]+" ");
            }
            System.out.println();
        }
        int[]ortkar=new int[n];
        for(int i=0;i<n;i++){
            int toplam=0;
            for(int j=0;j<12;j++){
                toplam+=sirkar[i][j];
            }
            ortkar[i]=toplam/12;
            System.out.print(ortkar[i]+" ");
        }
        System.out.println();
        int maxay=0,minay=0;
        for(int i=0;i<n;i++){
            int maxk=sirkar[i][0],mink=sirkar[i][0];
            for(int j=0;j<12;j++){
                if(maxk<sirkar[i][j]){
                    maxk=sirkar[i][j];
                    maxay=j;
                }
                if(mink>sirkar[i][j]){
                    mink=sirkar[i][j];
                    minay=j;
                }
            }
            System.out.println((i+1)+".şirketin min karı "+mink+" ayı "+ minay+ " max karı "+maxk+" ayı "+maxay) ;
        }
        int minsirket=0,maxsirket=0;
        for(int j=0;j<12;j++){
            int maxk=sirkar[0][j],mink=sirkar[0][j];
            for(int i=0;i<n;i++){
                if(maxk<sirkar[i][j]){
                    maxk=sirkar[i][j];
                    maxsirket=i;
                }
                if(mink>sirkar[i][j]){
                    mink=sirkar[i][j];
                    minsirket=i;
                }
            }
            System.out.println((j+1)+" . ayın max karı "+maxk+" şirketi "+maxsirket+" min karı "+mink+" şirketi "+minsirket);
        }
    }

}
