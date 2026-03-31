class Solution {
    int p = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) return null;

        int val = preorder[p];
        p = p + 1;
        TreeNode root = new TreeNode(val);

        int index = start;
        for (int i = start; i <= end; i++) {
            if (inorder[i] == val) {
                index = i;
                break;
            }
        }

        root.left = build(preorder, inorder, start, index - 1);
        root.right = build(preorder, inorder, index + 1, end);

        return root;
    }
}