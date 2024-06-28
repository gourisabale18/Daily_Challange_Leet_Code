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
    public int findBottomLeftValue(TreeNode root) {
      
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      List<Integer> list1=new ArrayList<>();

      while(!q.isEmpty())
      {
     //   int size=q.size();
    //    for(int i=0;i<size;i++)
//{
            TreeNode curr=q.poll();
             if(curr.right!=null)
            {
                q.add(curr.right);
            }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            
        list1.add(curr.val);
   //     }
      }

        return list1.get(list1.size()-1);
        
    }
}