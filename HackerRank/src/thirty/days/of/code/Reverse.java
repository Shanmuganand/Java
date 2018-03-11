package thirty.days.of.code;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int i = arr.length-1;
        while(i>=0){
            str.append(arr[i]+" ");
            i--;
        }
        System.out.println(str.toString());
        in.close();
    }

}
