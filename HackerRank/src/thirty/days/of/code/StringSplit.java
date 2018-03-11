package thirty.days.of.code;

import java.util.*;

public class StringSplit {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 0;        
        while(j<i){
            char[] temp = sc.next().toCharArray();
         
            StringBuilder evenIndices = new StringBuilder();
            StringBuilder oddIndices = new StringBuilder();
            
            int k = 0;
            
            while(k<temp.length){
                if (k % 2 == 0) {
					evenIndices.append(temp[k]);
				} else {
					oddIndices.append(temp[k]);
				}
                k++;
            }
            
            System.out.println(evenIndices.toString() + " " + oddIndices.toString());            
            j++;
        }
        	sc.close();
    }
}
