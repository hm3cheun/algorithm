import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights, double[] unit, double MaxWeightRatio, int MaxWeightRatioIndex) {
        
        /*
           System.out.println("MaxWeightRatioIndex: " + MaxWeightRatioIndex );
           System.out.println("MaxWeightRatio: " + MaxWeightRatio );
           int next = getNextMaxIndex(unit, MaxWeightRatioIndex);
           System.out.println("NextIndex " + next);
           System.out.println("NextIndexRatioIndex " + unit[next]);
           next = getNextMaxIndex(unit, next);
           System.out.println("NextIndex " + next);
           System.out.println("NextIndexRatioIndex " + unit[next]);
           next = getNextMaxIndex(unit, next);
           System.out.println("NextIndex " + next);
           System.out.println("NextIndexRatioIndex " + unit[next]);
           next = getNextMaxIndex(unit, next);
           System.out.println("NextIndex " + next);
           System.out.println("NextIndexRatioIndex " + unit[next]);
           */
           double cur_value = 0;
           int current_max_unit_index = MaxWeightRatioIndex; // initalize index
           System.out.println("initial current_max_unit_index: " + current_max_unit_index);
           while ( capacity != 0)
           {
               if ( capacity <= weights[current_max_unit_index])
               {
                   cur_value += capacity * unit[current_max_unit_index];
                   capacity -= capacity;
               }
               else{
                   cur_value += values[current_max_unit_index];
                   capacity -= weights[current_max_unit_index];
               }
               current_max_unit_index=getNextMaxIndex(unit,current_max_unit_index);
               System.out.println("current_max_unit_index: " + current_max_unit_index);
           }
           
           
           return cur_value; 
    }
    
    private static int getNextMaxIndex(double [] unit, int MaxWeightRatioIndex)
    {
        
        double temp_max = unit[MaxWeightRatioIndex];
        int next_max_index = MaxWeightRatioIndex;
         System.out.println("unit.length: "+ unit.length);
        for (int i =0; i < unit.length; i++ )
        {
            
                if((unit[i] == temp_max) && (i != MaxWeightRatioIndex)){
                    System.out.println("unit["+i+"] =" +unit[i]);
                    temp_max = unit[i];
                    next_max_index = i;
                } 
                else if((unit[i] < temp_max) && (i != MaxWeightRatioIndex))
                {
                    System.out.println("unit["+i+"] =" +unit[i]);
                    temp_max = unit[i];
                    next_max_index = i;
            
                }
                
        }
        return next_max_index;
        
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        double[] unit = new double[n];
        double MaxWeightRatio = 0;
        int MaxWeightRatioIndex = 0;
        for (int i = 0; i < n; i++) {
        
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
            if ((long)(values[i] / weights[i]) > MaxWeightRatio) {
              MaxWeightRatio = (long)(values[i] / weights[i]);
              MaxWeightRatioIndex = i;
            }
            unit[i] =(double) (values[i] / weights[i]) ;
        }
        System.out.println(getOptimalValue(capacity, values, weights, unit, MaxWeightRatio, MaxWeightRatioIndex));
    }
} 
