public class dizisıralımıkontrolreursive {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5,0};
        boolean siraliMi = siraliMi(dizi);
        System.out.println(siraliMi);
    }   
     public static boolean siraliMi(int[] dizi, int index) {
            if (index == dizi.length - 1) {
                // Dizi sonuna kadar geldik, yani sıralı
                return true;
            }
            if (dizi[index] > dizi[index+1]) {
                // Eğer bir önceki eleman bir sonraki elemandan büyükse, dizi sıralı değil
                return false;
            }
            // Dizinin bir sonraki elemanını kontrol etmek için fonksiyonu tekrar çağırıyoruz
            return siraliMi(dizi, index+1);
    }
    public static boolean siraliMi(int[] dizi) {
        return siraliMi(dizi, 0);
    }
}
