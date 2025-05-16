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
    // 方法 1️⃣：遞迴法 (O(n)) ✅ 經典首選
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree1(root.right);
        root.right = invertTree1(temp);

        return root;
    }

    // 方法 2️⃣：DFS 非遞迴法 (O(n))
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }
        }

        return root;
    }
}
