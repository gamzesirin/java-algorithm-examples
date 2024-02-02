// girilen sayıdan 10 a kadar olan tek sayıların toplamını bulan program
public class recursive6 {
    public static void main(String[]args){
        int toplam=toplam(1);
        System.out.println("toplam = "+toplam);
    }
    public static int toplam(int n){
        if(n<10){
            return n+toplam(n+2);
        }
        return 0;
        
    }
}
