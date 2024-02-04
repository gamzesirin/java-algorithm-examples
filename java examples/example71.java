// girilen kelimeyi  şu şeklilde yazadıran program örnek : berkay -> kraeyb
package org.example;
import java.util.Scanner;
public class example71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String txt = input.nextLine();

        if (txt.length() % 2 == 0) {
            for (int i = 0; i < txt.length() / 2; i++) {
                System.out.print(txt.charAt(txt.length() / 2 + i));
                System.out.print(txt.charAt(txt.length() / 2 - 1 - i));
            }
        } else {
            System.out.print(txt.charAt(txt.length() / 2));
            for (int i = 1; i <= txt.length() / 2; i++) {
                System.out.print(txt.charAt(txt.length() / 2 + i));
                System.out.print(txt.charAt(txt.length() / 2 - i));

            }
        }
    }
}