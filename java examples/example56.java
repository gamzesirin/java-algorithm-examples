//girilen kelimenin her bir harfini iki defa yazdıran program
package org.example;
import java.util.Scanner;
public class example56 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String txt=input.nextLine();
        for(int i=0;i<txt.length();i++){
            System.out.print(txt.charAt(i));
            System.out.print(txt.charAt(i));
        }
        System.out.println();
    }
}
