public class Q11 {
public void serialize(Node root, ArrayList<Integer> A) 
{
    //code here
    if(root!=null)
    A.add(root.data);
    else {
        A.add(-1);
        return;
    }
    serialize(root.left,A);
    serialize(root.right,A);
}

//Function to deserialize a list and construct the tree.
int idx = 0;
   public Node deSerialize(ArrayList<Integer> A)
   {
       if(idx>=A.size()||A.get(idx)==-1) {
           idx++;
           return null;
       }
       Node root = new Node(A.get(idx++));
       root.left = deSerialize(A);
       root.right = deSerialize(A);
       return root;
   }
    
}
