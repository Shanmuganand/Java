package thirty.days.of.code;

public class BinaSearchTree {
	
	static int height = 0;

    static int  getHeight(Nodes root){            
        
        if(root.left != null)
            getDepth(0,root.left);
        
        if(root.right != null)
            getDepth(0,root.right);
        
        return height;
    }




    static void getDepth(int depth,Nodes root){
        
        depth++;
        
        if(root.left != null)
            getDepth(depth,root.left);

        if(root.right != null)
            getDepth(depth,root.right);
    
        if(root.left == null && root.right == null)
            height = height>depth?height:depth;
                    
    }


}

class Nodes{
    Nodes left,right;
    int data;
    Nodes(int data){
        this.data=data;
        left=right=null;
    }
}
