public class basmaktoplamırecursive {
    public static void main(String[] args) {
          int x= getDigitSum(12) ;
          System.out.println(x);
    }
    public static int getDigitSum(int n) {
        if (n < 10) { // base case: if n has only one digit, return n
            return n;
        }
        else { // recursive case: sum the last digit of n and the sum of the remaining digits
            return n % 10 + getDigitSum(n / 10);
        }
    }
}

