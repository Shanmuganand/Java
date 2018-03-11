package thirty.days.of.code;

import java.util.Map;
import java.util.TreeMap;

public class BinaryTraversal {
	static Map<Integer,String> map = new TreeMap<Integer,String>();

	static void levelOrder(Nodes root){
	      //Write your code here
	      if(root != null){
	          print(root.data,0); 
	          nodedata(root,0);
	      }
	    StringBuilder str = new StringBuilder();
	    for(int i : map.keySet()){
	        str.append(map.get(i));
	    }
	    System.out.println(str);
	}

	static void nodedata(Nodes root,int i){
	    if(root != null){
	          i++;
	          node(root.left,i);
	          node(root.right,i);
	          nodedata(root.left,i);
	          nodedata(root.right,i);
	      }
	}

	static void node(Nodes node, int i){
	    if(node!=null){
	        print(node.data,i);
	    }
	}
	static void print(int data, int i){
	    map.put(i,map.getOrDefault(i,"")+data+" ");
	}
}

