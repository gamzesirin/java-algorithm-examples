public class methot3 {
    public static void main(String[]args){
        int p=power(10,2);
        System.out.println(p);
    }
    public static int power(int s1,int s2){
        int result=1;
        for(int i=1;i<=s2;i++){
            result*=s1;
        }
        return result;
    }
}
