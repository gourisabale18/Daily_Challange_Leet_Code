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
    int result;
    public int sumNumbers(TreeNode root) {

        sumofAllPaths(root,0);
        return result;
   
    }
    private void sumofAllPaths(TreeNode root,int currValue)
    {
        //base case
        if(root==null)
        {
            return;
        }
          currValue=currValue*10+root.val; 
          if(root.left==null && root.right==null)
        {
            result+=currValue;
        }
        
          sumofAllPaths(root.left,currValue);
         sumofAllPaths(root.right,currValue);
        

       
       

    }
}