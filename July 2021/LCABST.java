import java.util.*;
public class LCABST 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp = p;
            p = q;
            q = temp;
        }
        if(p.val==root.val || q.val==root.val || (p.val<root.val && q.val>root.val)) return root;
        else {
            if(p.val>root.val) return lowestCommonAncestor(root.right,p,q);
            else return lowestCommonAncestor(root.left,p,q);
        }
    }
    public static void main()
    {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(5);
        LCABST ob = new LCABST();
        TreeNode ans = ob.lowestCommonAncestor(root,p,q);
        System.out.println("LCA : "+ans.val);
    }
}
class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    { 
        val = x; 
    }
}