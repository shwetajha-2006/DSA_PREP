class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    
    private boolean check(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) 
            && check(t1.left, t2.right) 
            && check(t1.right, t2.left);
    }
}