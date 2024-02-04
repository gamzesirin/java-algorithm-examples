package org.example;
import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 1. sayıyı giriniz");
        int s1 = input.nextInt();
        System.out.println("lütfen 2. sayıyı giriniz");
        int s2 = input.nextInt();
        System.out.println("lütfen 3. sayıyı giriniz");
        int s3 = input.nextInt();
        if(s1<s2&&s2<s3){
            System.out.println(s1 +" "+s2+" "+s3);
        }
        else if(s1<s2&&s3<s2&&s1<s3){
            System.out.println(s1+" "+s3+" "+s2);
        }
        else if(s1<s2&&s3<s1&&s3<s2){
            System.out.println(s3+" "+s1+" "+s2);
        }
        else if(s2<s1&&s2<s3&&s1<s3){
            System.out.println(s2+" "+s1+" "+s3);
        }
       else if(s2<s1&&s2<s3&&s3<s1){
            System.out.println(s2+" "+s3+" "+s1);
        }
       else
            System.out.println(s3+" "+s2+" "+s1);
        }

}
