//büyük harflerle girilen kelimenin harflerini büyük harf küçük harf şeklinde yazan program
package org.example;
import java.util.Scanner;
public class example55 {
    public  static void main( String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String txt =input.nextLine().toUpperCase();
       for(int i=0;i<txt.length();i++){
           if(i%2==0){
               System.out.print(txt.charAt(i));
           }
           else{
               System.out.print(Character.toLowerCase(txt.charAt(i)));
           }
       }

    }
}
