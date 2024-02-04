//girilen cümlede kaç tane a ile biten kelime olduğunu bulan program
package org.example;
import java.util.Scanner;
public class example58 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String txt=input.nextLine();
        int s=0;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)==' '){
                if(txt.charAt(i-1)=='a'){
                    s++;
                }
            }
        }
        System.out.println("cümlede "+ s+ " tane a harfi ile biten kelime vardır");
    }
}


