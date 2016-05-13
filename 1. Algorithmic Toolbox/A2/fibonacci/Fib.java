import java.util.Scanner;

public class Fib {
  private static long calc_fib(int n) {
     
        long x1 = 0;
        long x2 = 1;
        long x3 = 1;
        for (int i = 0; i < n; i++) {
            x1 = x2;
            x2 = x3;
            x3 = x1 + x2;
        }
        return x1;
    
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
