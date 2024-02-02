// 1 ile girilen sayı arasındaki tek sayıların toplamını bulan program
public class recursive10 {
    public static void main(String[]args){
        int toplam=tektoplam(12);
        System.out.println("toplam ="+toplam);
    }
    public static int tektoplam(int n){
        if(n>0){
            return n-1 +tektoplam(n-2);
        }
        else{
            return 0;
        }
    }
}
