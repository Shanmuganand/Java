package thirty.days.of.code;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
       
        in.close();
        int numberOfSwaps = 0;
        // Write Your Code Here
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                  
                    a[j] = a[j] + a[j + 1];
                    a[j+1] = a[j] - a[j+1];
                    a[j] = a[j] - a[j+1];
                    numberOfSwaps++;
                }
            }
           
        }
        
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.\nFirst Element: "+a[0]+"\nLast Element: "+a[a.length-1]);
        
    }
}
