//girilen parayı banknotlara ayıran program
package org.example;
import java.util.Scanner;
public class example49 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("para tutarını giriniz");
        int para=input.nextInt();
        int []banknot={200,100,50,20,10,5,1};
        for(int i=0;i<banknot.length;i++) {
            int adet = para / banknot[i];
            para = para % banknot[i];
            if (adet != 0) {
                System.out.print( adet +" tane " + banknot[i] + " ");
            }
        }
    }
}
