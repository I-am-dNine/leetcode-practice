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
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree1(root.right);
        root.right = invertTree1(temp);

        return root;
    }
}
