public class recursive8 {
    public static void main(String[]args){
        String x=metot(9476);
        System.out.println(x);
    }
    public static String metot(int sayi) {
        String metin = "";
        if (sayi > 0) {
            if (sayi % 10 == 0) {
                metin += metot(sayi / 10);
                metin += "zero";
                
            }
            if (sayi % 10 == 9) {
                metin += metot(sayi / 10); 
                metin += "nine";
               
            }
            if (sayi % 10 == 8) {
                metin += metot(sayi / 10);
                metin += "eight";
                
            }
            if (sayi % 10 == 7) {
                metin += metot(sayi / 10);
                metin += "seven";
                            }
            if (sayi % 10 == 6) {
               metin += metot(sayi / 10); 
               metin += "six";
                
            }
            if (sayi % 10 == 5) {
                 metin += metot(sayi / 10);
                 metin += "five";
               
            }
            if (sayi % 10 == 4) {
                metin += metot(sayi / 10);
                metin += "four";
                
            }
            switch (sayi % 10) {
                case 3 -> {
                    metin += metot(sayi / 10);
                    metin += "three";
                    
                }
                case 2 -> {
                    metin += metot(sayi / 10);
                    metin += "two";
                    
                }
                case 1 -> {
                   metin += metot(sayi / 10); 
                   metin += "one";
                    
                }
                default -> {
                }
            }

        }
        return metin;
    }
}
