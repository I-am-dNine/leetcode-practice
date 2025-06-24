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

    private int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }

    private int depth(TreeNode node) {
        if (node == null)
            return 0;

        int leftDepth = depth(node.left);   // 左子樹的深度
        int rightDepth = depth(node.right); // 右子樹的深度

        // 更新直徑（左邊 + 右邊的邊數）
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        // 回傳當前節點的深度（往父節點回傳）
        return Math.max(leftDepth, rightDepth) + 1;
    }
}