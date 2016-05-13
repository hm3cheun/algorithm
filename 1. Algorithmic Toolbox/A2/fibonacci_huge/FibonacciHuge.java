import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHuge(long n, long m) {
            // return n + 1 value in Pisano
        /*
            System.out.println(getPisano(2)==3);
            System.out.println(getPisano(3)==8);
            System.out.println(getPisano(4)==20);
            System.out.println(getPisano(5)==12);
            System.out.println(getPisano(6)==28);
            System.out.println(getPisano(7)==16);
            System.out.println(getPisano(8)==36);
            System.out.println(getPisano(9)==20);
            */
            long f1 = (n%getPisano(m));
            
            return getFibonacciLastDigit(f1,m);
           
    }
    private static long getFibonacciLastDigit(long n, long m) {
        long MOD = m;
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
    
    private static long getPisano(long m){
        
          if ( m == 2){
                return 3;
            }
            else if ( m == 3){
              return 8;  
            }
            else{
               if ((m+1)%2 == 1)
                  return (4*(m) + 4); 
                else
                  return 2*(m+1);
            }  
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        
        
        System.out.println(getFibonacciHuge(n, m));
    }
}

