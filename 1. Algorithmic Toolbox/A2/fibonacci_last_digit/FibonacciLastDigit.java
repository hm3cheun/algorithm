import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigit(int n) {
        final int MOD = 10;
         long x1 = 0;
        long x2 = 1;
        long x3 = 1;
        for (int i = 0; i < n; i++) {
            x1 = x2%MOD;
            x2 = x3%MOD;
            x3 = x1 + x2;
        }
        return x1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

