public class recursive3 {
    public static void main(String[]args){
        System.out.println(faktoriyel(5));
    }
    public static int faktoriyel(int n){
        if(n==0){
            return 1;   
        }
        else{
            return n*faktoriyel(n-1);
        }
    }
}
