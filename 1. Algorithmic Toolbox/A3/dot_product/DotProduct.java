import java.util.*;

public class DotProduct {
    private static long minDotProduct(int[] a, int[] b) {
        //write your code here
      
		mergeSort(a);
		mergeSort(b);
		/*
		for (int i=0 ;i < a.length;i++)
	    	System.out.println(" a: "+a[i]);
	    for (int i=0 ;i < b.length;i++)
	    	System.out.println(" b: "+b[i]);
	    	
        return 0;
        */
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[a.length - 1 -i];
        }
        return result;
    }

public static void mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
               
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
        arr[k++] = left[i++];
        }
        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(minDotProduct(a, b));
    }
}

