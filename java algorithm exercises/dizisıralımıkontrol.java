
public class dizisıralımıkontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]dizi={1,3,5,7,9,27,56,83,39};
        boolean siralimi =isSorted(dizi);
        System.out.println(siralimi);
    }
    public static boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i+1]) {
            return false;
        }
    }
    return true;
    }

}
