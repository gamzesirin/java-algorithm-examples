package org.example;
public class example2 {
    public static void main(String[] args) {
        int tt=0;
        int ct=0;
        int tcarp=1;
        int ccarp=1;
      for(int i=1;i<=99;i++){
          if(i%2==0){
              ct+=i;
              ccarp*=i;
          }
          else{
              tt+=i;
              tcarp*=i;
          }
      }
        System.out.println("1 ile 99 arasındaki tek sayıların toplamı= "+tt+ " çitf sayıların toplamı= "+ct+
                " tek sayıların çarpımı= "+tcarp+" çift sayıların çarpımı= "+ccarp);


    }
}
