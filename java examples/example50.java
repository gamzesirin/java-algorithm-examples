package org.example;
import java.util.Scanner;
public class example50 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String txt=input.nextLine();
        int s=1;
        for (int i=0;i<txt.length();i++){
            if(i==0){
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else if(txt.charAt(i)==' '){
                System.out.print(Character.toLowerCase(txt.charAt(i)));
                System.out.print(Character.toUpperCase(txt.charAt(i+1)));
                i++;
                s++;
            }
            else{
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
        }
        System.out.print(" girilen cümlede "+ s +" tane kelime vardır");
    }
}