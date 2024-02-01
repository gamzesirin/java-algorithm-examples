package com.mycompany.vveek1;

/*


 *****
 ****
 ***
 **
 *


 */
import  java.util.Scanner;
public class yıldız10 {
    public static void main(String[] args) {
        Scanner klavye =new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row =klavye.nextInt();
        int bosluk=0;
        for (int i = 1; i <=row; i++) {
            for (int j = row; j>=i; j--) {
                System.out.print("*");
            }
            for (int k = bosluk; k >= 0; k--) {
                System.out.print("");
            }
            bosluk++;
            System.out.println("");
        }
    }
}
