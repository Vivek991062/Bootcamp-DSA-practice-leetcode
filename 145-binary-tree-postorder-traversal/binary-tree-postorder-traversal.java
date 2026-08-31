class Solution {
    public void traversal(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        traversal(root.left,ans);
        traversal(root.right,ans);
        ans.add(root.val);
        
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        traversal(root,ans);
        return ans;
        
    }
}