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
class Solution 
{
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();

        if(root == null) return list;
        que.add(root);

        while(!que.isEmpty())
        {
            int size = que.size();
            int k = size;
            double sum = 0;

            while(size-->0)
            {
                TreeNode node = que.remove();
                sum += node.val;

                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);               
            }
            list.add(sum/k);
        }
        return list;
    }
}