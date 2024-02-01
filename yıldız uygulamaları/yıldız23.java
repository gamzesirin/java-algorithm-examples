/*

 *****
  ****
   ***
    **
     *

 */
import java.util.Scanner;
public class yıldız23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row=input.nextInt();
        for (int i = 0; i <row; i++) {
            for (int j =0; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = row; k >i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}