package thirty.days.of.code;

public class ExceptionHandling {
	
	    
	    public int power(int i, int j) throws Exception{
	        
	        if(i<0 || j<0){
	            throw new Exception("n and p should be non-negative");
	        }else{
	            return (int) Math.pow(i, j);
	        }
	        
	    }
	    
	    
public static void main(String[] args) {
	
	ExceptionHandling exc = new ExceptionHandling();
	try {
		exc.power(2, 4);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
