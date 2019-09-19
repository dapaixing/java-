import java.util.*;

public class Solution {
    private static class TreeNode{
        private char val;
        private TreeNode left = null;
        private TreeNode right = null;

        private TreeNode(char val) {
            this.val = val;
        }
    }
    private static class BTRV{
        private TreeNode root;
        private int used;
        private BTRV(TreeNode root, int used) {
            this.root = root;
            this.used = used;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] chars = line.toCharArray();
        BTRV btrv = buildTree5(chars);
        inOrderTraversal(btrv.root);

    }


    public static BTRV buildTree5(char [] preorder){
        if (preorder.length == 0){
           return new BTRV(null,0);
        }
        if (preorder[0] == '#'){
            return new BTRV(null,1);
        }
        TreeNode root = new TreeNode(preorder[0]);
        BTRV leftReturn = buildTree5(Arrays.copyOfRange(preorder,1,preorder.length));
        BTRV rightReturn = buildTree5(Arrays.copyOfRange(preorder,1 + leftReturn.used,preorder.length));


        root.left = leftReturn.root;
        root.right = rightReturn.root;


        return new BTRV(root,1 + leftReturn.used+rightReturn.used);
    }

    public  static void inOrderTraversal(TreeNode root){
        if (root != null){
            inOrderTraversal(root.left);
            System.out.println(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
}
