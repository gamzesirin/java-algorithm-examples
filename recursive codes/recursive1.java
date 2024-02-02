
public class recursive1 {
    public static void main (String []args){
        
        int a=toplamfonksiyonu(10);
        System.out.println(a);
        int b=r(10);
        System.out.println(b);
        
    }
    public static int toplamfonksiyonu(int x ){
        int toplam=0;
        for(int i=1;i<=x;i++){
            toplam+=i;
        }
        return toplam;
    }
    // yukarıdaki fonksiyonu recursive fonksiyon haline getirerek yazdığım fonksiyon
    public static int r(int x){
        if(x==1){
            return 1;
        }
        return x+r(x-1);
    }
}
