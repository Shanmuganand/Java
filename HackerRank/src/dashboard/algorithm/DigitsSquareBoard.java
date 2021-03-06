package dashboard.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class DigitsSquareBoard {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       for(int i =0;i<n;i++){
	           int x = sc.nextInt();
	           Prime[][] y = new Prime[x][];
	           sc.nextLine();
	           for(int j = 0;j<x;j++){
	        	   
	        	 int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();	        	
	        	 for (int k = 0; k < a.length; k++) {
	        		Prime primeValues = new Prime();
	        		primeValues.setValue(a[k]);
	        		primeValues.setPrime(isPrime(a[k]));	        		
	        		y[j][k] = primeValues;
				 }  
	        	
	             //y[j] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	           }
	           for(int j = 0;j<x;j++){
	        	   System.out.println(y[j][0] + " " + y[j][1]);
	           }
	       }
	       sc.close();

	    }	
	
	
	private static boolean isPrime(int temp) {		

        if(temp<=1){
        	return false;
        }else if(temp<=3){
        	return true;
        }else if(temp%2==0 || temp%3==0 ){
        	return false;
        }
        for(int j = 5; j*j <= temp; j+=6){
            if(temp%j==0 || temp%(j+2)==0){
            	return false;
            }                    
        }
        return true;		
	}
	    
}

class Prime{
	
	private int value;
	private boolean isPrime;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
}
