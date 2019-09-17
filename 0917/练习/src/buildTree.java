public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootValue = preorder[0];
        int leftCount;
        for (leftCount = 0; leftCount < inorder.length; leftCount++) {
            if (inorder[leftCount] == rootValue) {
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        int[] leftPreorder = Arrays.copyOfRange(preorder,
                1, 1 + leftCount);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, leftCount);
        root.left = buildTree(leftPreorder, leftInorder);
        int[] rightPreorder = Arrays.copyOfRange(preorder,
                1 + leftCount, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder,
                leftCount + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
    import java.util.Arrays;
    class Solution {
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if(postorder.length == 0){
                return null;
            }
            int rootValue = postorder[postorder.length-1];
            int leftCount;
            for(leftCount = 0;leftCount < inorder.length;leftCount++){
                if(inorder[leftCount] == rootValue){
                    break;
                }
            }
            TreeNode root = new TreeNode(rootValue);
            int[] leftPostorder = Arrays.copyOfRange(postorder,0,leftCount);
            int[] leftInorder = Arrays.copyOfRange(inorder,0,leftCount);
            root.left = buildTree(leftInorder,leftPostorder);
            int[] rightPostorder = Arrays.copyOfRange(postorder,leftCount,postorder.length-1);
            int[] rightInorder = Arrays.copyOfRange(inorder,leftCount+1,inorder.length);
            root.right = buildTree(rightInorder,rightPostorder);

            return root;
        }
    }
}
