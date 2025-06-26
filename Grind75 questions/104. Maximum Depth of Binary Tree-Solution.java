
class Solution {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // 遞迴 DFS
    public int maxDepth(TreeNode root) {
        // 遞迴終止條件：如果節點為 null，代表深度為 0
        if (root == null)
            return 0;

        // 遞迴計算左右子樹的深度
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // 取較大值，加上當前節點自身
        return Math.max(leftDepth, rightDepth) + 1;
    }
}