public class recursive9 {
    public static void main(String[]args){
        String x=metot(123);
        System.out.println(x);
    }
    public static String metot(int sayi) {
        String metin = "";
        if (sayi > 0) {
            if (sayi % 10 == 0) {
                metin += "zero";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 9) {
                metin += "nine";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 8) {
                metin += "eight";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 7) {
                metin += "seven";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 6) {
                metin += "six";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 5) {
                metin += "five";
                metin += metot(sayi / 10);
            }
            if (sayi % 10 == 4) {
                metin += "four";
                metin += metot(sayi / 10);
            }
            switch (sayi % 10) {
                case 3 -> {
                    metin += "three";
                    metin += metot(sayi / 10);
                }
                case 2 -> {
                    metin += "two";
                    metin += metot(sayi / 10);
                }
                case 1 -> {
                    metin += "one";
                    metin += metot(sayi / 10);
                }
                default -> {
                }
            }

        }
        return metin;
    }
}
