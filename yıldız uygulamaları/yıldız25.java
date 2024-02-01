
/*
 
 *****
  ****
   ***
    **
     * 

 */
import java.util.Scanner;
public class yıldız25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir satır sayısı giriniz");
        int row=input.nextInt();
        int bosluk=0;
        for (int i = row; i >=1; i--) {
            for (int j = 0; j < bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            bosluk++;
            System.out.println("");
        }
    }
}
