package thirty.days.of.code;

public class Bitwise {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int n = 3;
        //in.nextLine();
        
        for(int i = 0;i<n;i++){
            String values = "8 5";
            int k = Integer.parseInt(values.split(" ")[0]); 
            int h = Integer.parseInt(values.split(" ")[1]); 
            int max = 0;
            for(int j=1;j<=k;j++){
                for(int l=j+1;l<=k;l++){
                    int g = result(j,l);
                    if(g<h)
                        max = g>max?g:max;
                }
            }
            System.out.println(max);
        }
        
    }
    
    private static int result(int i, int j){
        return (i & j);
    }

}
