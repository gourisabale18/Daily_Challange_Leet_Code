/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        //lets use set to store values of nodes to delete

        Set<Integer> hset=new HashSet<>();
        for(int i : to_delete)
        {
            hset.add(i);
        }

        List<TreeNode> res=new ArrayList<>();
        if(!hset.contains(root.val))
        {
            res.add(root); //root value added
        }
        traverse(root, hset,res, null, false);
        return res;
    }
    private void traverse(TreeNode root, Set<Integer> hset, List<TreeNode> res, TreeNode parent, boolean isLeft)
    {
        if(root==null) return;

        if(hset.contains(root.val))
        {
            if(parent!=null)
            {
                if(isLeft)
                {
                    parent.left=null;
                }
                else
                {
                    parent.right=null;
                }
            }

        if(root.left!=null && !hset.contains(root.left.val))
        {
            res.add(root.left);
        }
        if(root.right!=null && !hset.contains(root.right.val))
        {
            res.add(root.right);
        }
        }
       traverse(root.left,hset,res,root,true);
       traverse(root.right,hset,res, root,false);

    }
}