package com.mycompany.vveek1;
/*

     *
    **
   ***
  ****
 *****


 */
import java.util.Scanner;
public class yıldız15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row =input.nextInt();
        int bosluk=row-1;
        for (int i = 0; i < row; i++) {
            for (int j =0; j<bosluk; j++) {
                System.out.print(" ");               
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");            
            }   
            bosluk--;
            System.out.println("");
        }
    }
}
