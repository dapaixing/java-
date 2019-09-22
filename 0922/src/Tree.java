
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree {
    public static void preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.println(top.val);
            cur = top.right;
        }
    }
    public static void postruel(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node last = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.peek();
            if (top.right == null || top.right == last){
                System.out.println(top.val);
                stack.pop();
                last = top;
            }else {
                cur = top.right;
            }
        }
    }
    public static List<Integer> preorderTraversal(Node root){
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        List<Integer> list = new ArrayList<>();
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        return list;
    }
}
