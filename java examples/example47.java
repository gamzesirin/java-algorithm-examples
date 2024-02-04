//abone numarası 12 den kısa ise önüne sıfır ekleyerek 12 ye tamamlayan program
package org.example;
import java.util.Scanner;
public class example47 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("abone numarsını giriniz");
        String aboneno=input.nextLine();
        String[]no=new String[aboneno.length()];
        for(int i=0;i<12-no.length;i++){
            System.out.print("0");
        }
        System.out.print(aboneno);
    }
}