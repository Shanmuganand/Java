package thirty.days.of.code;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDupe {
	public static Node removeDuplicates(Node head) {
	      //Write your code here
	        Node start=head;
	        List<Integer> temp = new ArrayList<Integer>();
	        Node tempNode = null;
	        boolean dupfound = false;
	          while(start!=null)
	          {
	                if(!dupfound && dupeFound(temp,start.data)){
	                    dupfound = true;
	                    tempNode.next = null;
	                }else if(dupfound && !dupeFound(temp,start.data)){
	                    tempNode.next = start;   
	                    temp.add(start.data);
	                    tempNode = start;
	                    dupfound = false;
	                }else if(!dupeFound(temp,start.data)){
	                    temp.add(start.data);
	                    tempNode = start;
	                    dupfound = false;
	                }


	                start=start.next;
	          }
	        return head;
	    }


	    public static boolean dupeFound(List<Integer> temp, int i){
	        for(Integer j : temp){
	            if(i == j)
	                return true;
	        }
	        
	        return false;
	        
	    }

}
