public class recursive5 {
    public static void main(String[]args){
        System.out.println(findbinary(233,""));
    }
    public static String findbinary(int decimal,String result){
        if(decimal==0){
            return result;
        }
        result =decimal%2+result;
        return findbinary(decimal/2,result);
    }
}
