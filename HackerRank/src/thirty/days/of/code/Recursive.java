package thirty.days.of.code;

import java.util.Scanner;

public class Recursive {
	static int factorial(int n) {
        if(n!=0)
            return n = n * factorial(n-1);
        else
            return 1;        
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    in.close();
    }

}
