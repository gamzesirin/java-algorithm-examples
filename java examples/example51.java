package org.example;
import java.util.Random;
import java.util.Scanner;
public class example51 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String txt = input.nextLine();
        Random r = new Random();
        char[] harfler = new char[txt.length()];
        for (int i = 0; i < txt.length(); i++) {
            int a=r.nextInt(txt.length());
            if(a%2==0){
                System.out.print(harfler[a]);
            }
            else{
                System.out.println(harfler[a]);
            }
        }

    }
}
