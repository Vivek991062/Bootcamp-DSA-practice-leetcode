class Solution {
    public void traversal(TreeNode root,List<Integer> ans){
       if(root==null){
        return;
       }

       traversal(root.left,ans);
       ans.add(root.val);
       traversal(root.right,ans);
    }
     public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        traversal(root,ans);
        return ans;
        
    }

    


}