
package com.mycompany.vveek1;

/*


 *****
 ****
 ***
 **
 *
 

 */
import java.util.Scanner;
public class yıldız9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row=input.nextInt();  
        for (int i = 0; i <row; i++) {
            for (int j = row; j >i; j--) {
                System.out.print("*");
            }
            for (int k =row-i ; k <row; k++) {
                System.out.print("");
            }
            System.out.println("");
        }
    }
}
