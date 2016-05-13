import java.util.*;

public class LCM {
  private static int gcd(int a, int b) {
    int gcd;
        if (  b == 0 )
            return a;
        else if ( a == 0 )
            return b;
        else
        {
          if ( a < b)
            { 
            gcd= gcd (a, b%a );
            }
          else
          {
            gcd=gcd (b, a%b );
          }
        }
        return gcd ;
  }
  private static long lcm(int a, int b) {
    //write your code here
    long GCD =gcd(a,b);
    return ( a/GCD ) * b;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm(a, b));
  }
}
