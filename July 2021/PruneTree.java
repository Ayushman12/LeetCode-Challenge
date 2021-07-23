import java.util.*;
public class PruneTree
{
    public TreeNode pruneTree(TreeNode root) {
        if(root==null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left==null && root.right==null && root.val==0) return null;
        else return root;
    }
    public static void main()
    {
        PruneTree ob = new PruneTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(0);
        ob.pruneTree(root);
    }
}
