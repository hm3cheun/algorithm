import java.util.Scanner;

public class Change {
    private static int getChange(int n) {
        final int FIVE = 5;
        final int TEN = 10;
        int change = n;
        int TotalChange = 0;
       
        if (change >= TEN)
        {
            TotalChange += change/TEN;
            change = change%TEN;
        }
        
        if ( change < TEN && change >= FIVE)
        {
            TotalChange += change/FIVE;
            change = change%FIVE;
        }
        
        TotalChange += change;
        return TotalChange;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

