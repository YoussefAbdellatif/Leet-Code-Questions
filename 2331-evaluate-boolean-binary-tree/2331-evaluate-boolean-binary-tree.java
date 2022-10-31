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
    public boolean evaluateTree(TreeNode root) {
        boolean x =false ;
        boolean y =false;

        if (isLeafNode(root)){
            if (root.val==0){
                return false;
            }
            else
                return true;
        }
        if (root.val == 3 ){
            return evaluateTree(root.left) & evaluateTree(root.right);
        }
        if (root.val == 2 ){
            return evaluateTree(root.left) | evaluateTree(root.right);
        }

        return false;
    }
    public  boolean isLeafNode(TreeNode node){

        if(node.right == null && node.left == null){
            return true;
        }
        return false;
    }
}