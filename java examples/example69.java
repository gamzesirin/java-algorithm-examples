//kelimenin harflerini bir baştan bir sondan alarak yazan program
package org.example;

import java.util.Scanner;

public class example69 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String txt = input.nextLine();
        for (int i = 0; i < txt.length() / 2; i++) {
            System.out.print(Character.toLowerCase(txt.charAt(i)));
            System.out.print(Character.toLowerCase(txt.charAt(txt.length() - 1 - i)));
        }
        if (txt.length() % 2 == 1) {
            System.out.println(Character.toLowerCase(txt.charAt(txt.length() / 2)));
        }
    }
}
