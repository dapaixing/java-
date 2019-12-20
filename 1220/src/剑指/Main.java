package 剑指;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        ListNode list = null;
        ListNode last = null;
        while (list1 != null&&list2 != null){
            if (list1.val>=list2.val){
                if (list == null){
                    list = list1;
                    last = list;
                }else {
                    last.next = list1;
                }
                list1 = list1.next;
            }else {
                if (list == null){
                    list = list2;
                    last = list;
                }else {
                    last.next = list2;
                }
                list2 = list2.next;
            }
            last = last.next;
        }
        if (list1 != null){
            last.next = list1;
        }else {
            last.next = list2;
        }
        return list;
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;

        if (root1 != null && root2 != null){
            if (root1.val == root2.val){
                result = doseTree1HaveTree2(root1,root2);
            }
            if (!result){
                result = HasSubtree(root1.left,root2);
            }
            if (!result){
                result = HasSubtree(root1.right,root2)；
            }
        }
        return result;
    }

    private boolean doseTree1HaveTree2(TreeNode node1, TreeNode node2) {
        if (node2 == null){
            return true;
        }
        if (node1 == null){
            return false;
        }
        if (node1.val != node2.val){
            return false;
        }
        return doseTree1HaveTree2(node1.left,node2.left)&&doseTree1HaveTree2(node1.right,node2.right);
    }
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null&&root.right == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0||matrix[0].length == 0){
            return list;
        }
        int up = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while (true){
            for (int col = left ;col<=right;col++){
                list.add(matrix[up][col]);
            }
            up++;
            if (up>down)
                break;
            for (int row = up;row<=down;row++){
                list.add(matrix[row][right]);
            }
            right--;
            if (left>right)
                break;
            for (int col = right;col>=left;col--){
                list.add(matrix[down][col]);
            }
            down--;
            if (up>down)
                break;
            for (int row = down;row>=up;row--){
                list.add(matrix[row][left]);
            }
            left++;
            if (left>right)
                break;
        }
        return list;
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0||popA.length == 0||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.isEmpty()&&stack.peek() == popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
