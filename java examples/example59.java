//girilen ayın yılın kaçını ayı olduğunu bulan program
package org.example;
import java.util.Scanner;
public class example59 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("bir ay giriniz");
        String ay=input.nextLine();
        String[]aylar={"ocak ","subat","mart","nisan","mayıs","haziran","temmuz","agustos","eylül","ekim","kasım","aralık"};
        for (int i=0;i<aylar.length;i++){
            if(ay.equals(aylar[i])){
                System.out.println("girilen ay yılın "+(i+1)+". ayıdır");
            }
        }
    }
}