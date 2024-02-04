//kelimenin harflerini rastgele küçük büyük yazdıran program
package org.example;
import java.util.Random;
import java.util.Scanner;
public class example70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz");
        String txt = input.nextLine();
        Random r = new Random();
        for (int i = 0; i < txt.length(); i++) {
            int a=r.nextInt(5);
            if(a%2==0)
            {
                System.out.print((txt.charAt(a)));
            }
            else {
                System.out.print((txt.charAt(a)));
            }

        }
    }
}
