public class methot4 {
 public static void main(String []args){
     System.out.println(add(1,2));
     System.out.println(add(1,2,3));
     System.out.println(add(1,2,4.5));
     System.out.println(add(1,2.5,3));
     System.out.println(add(1,2.0,5.0));
 }
 public static int add(int a ,int b){
     System.out.println("1.methot çalıştı");
     return a+b;
 }
  public static int add(int a ,int b,int c){
     System.out.println("2.methot çalıştı");
     return a+b+c;
 }
 public static double add(int a ,int b,double c){
     System.out.println("3.methot çalıştı");
     return a+b+c;
 }
 public static double add(int a ,double b,int c){
     System.out.println("4.methot çalıştı");
     return a+b+c;
 }
 public static double add(int a ,double b,double c){
     System.out.println("5.methot çalıştı");
     return a+b+c;
 }
}
//methot overloading işlemine ilişkin bir örnek 