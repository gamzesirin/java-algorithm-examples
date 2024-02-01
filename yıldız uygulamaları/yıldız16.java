package com.mycompany.vveek1;

/*


     *
    **
   ***
  ****
 *****


 */
import java.util.Scanner;
public class yıldız16 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row=input.nextInt();
        int b=1;
       for (int i =row ; i >=1; i--) {
            for (int j =1 ; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= b; k++) {
                System.out.print("*");
            }
            b++;
            System.out.println(" ");
        }
        
    }
}
