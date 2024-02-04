// girilen kelimedeki sesli harflerin sayısını bulan ve indexini yazdıran program
package org.example;
import java.util.Scanner;
public class example68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String txt = input.nextLine();
        int s=0;
        char []sesli={'a','e','o','u','i'};
        int []yer=new int[255];
        for (int i = 0; i < txt.length(); i++) {
            char harf =Character.toLowerCase(txt.charAt(i));
            for (int j = 0; j < sesli.length; j++) {
                if (sesli[j]==harf) {
                    System.out.println((i+1)+". karakter seslidir ");
                    yer[s]=i;
                    s++;
                }
            }
        }
        for (int i = 0; i <s; i++) {
            System.out.print(yer[i]+",");
        }
        System.out.println(" toplam sesli harf = "+s);




    }
}
