/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class tmsayıbölenleri {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir pozitif tam sayı giriniz");
        int s=input.nextInt();
        for (int i = 1; i <=s; i++) {
            if(s%i==0){
            System.out.println(i);
            }
           
         }
    
}
}