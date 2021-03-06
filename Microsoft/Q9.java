public class Q9 {
    int count;
    private int subTreeSum(Node root, int X){
        if(root==null) return 0;
        int sum = root.data + subTreeSum(root.left, X) + subTreeSum(root.right, X);
        if(sum==X) count++;
        return sum;
    }
    
    int countSubtreesWithSumX(Node root, int X)
    {

	    count = 0;
	    subTreeSum(root, X);
	    return count;
    }
}
    
