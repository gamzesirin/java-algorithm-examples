package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class example24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int n = input.nextInt();
        int max = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("pozitif bir tamsayı giriniz");
            int s = input.nextInt();
            if (s % 2 == 0 && s > max) {
                max = s;
            }
        }
        System.out.println("girilen sayılar içinden en büyük çift tam sayı = " +max);

    }
}




