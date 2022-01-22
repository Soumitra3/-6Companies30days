public class Q8 {

public static void connectAdjacentNodeSameLevel(Node root) {
       Queue<Node> qu = new LinkedList<>();
       qu.add(root);
       while (qu.size() > 0) {
           int size = qu.size();
           Node p = null;
           while (size-- > 0) {
               Node cn = qu.remove();
               // adjust nextRight pointers
               if (p == null) {
                   p = cn;
                   p.nextRight = null;
               } else {
                   p.nextRight = cn;
                   p = p.nextRight;
                   p.nextRight = null;
               }
               //
               if (cn.left != null) qu.add(cn.left);
               if (cn.right != null) qu.add(cn.right);
           }
       }
    }}

