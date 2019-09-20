import java.util.LinkedList;
import java.util.Queue;

public class LeveOrder {
    private static class Node {
        char val;
        Node left;
        Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    private static class NodeLevel{
        private Node root;
        private int level;

        public NodeLevel(Node root, int level) {
            this.root = root;
            this.level = level;
        }
    }

    public static void main(String[] args) {

    }
    Queue<Node> queue = new LinkedList<>();
    public static void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node front = queue.poll();
            System.out.println(front.val);
            if (front.left != null){
                queue.offer(front.left);
            }
            if (front.right != null){
                queue.offer(front.right);
            }
        }
    }
    public static void leveOrder2(Node root){
        if (root == null){
            return;
        }
        Queue<NodeLevel> queue = new LinkedList<>();
        queue.offer(new NodeLevel(root,1));
        while (!queue.isEmpty()){
            NodeLevel front = queue.poll();
            System.out.println(front.level + " " + front.root.val);
            if (front.root.left != null){
                queue.offer(new NodeLevel(front.root.left,front.level+1));
            }
            if (front.root.right != null){
                queue.offer(new NodeLevel(front.root.right,front.level + 1));
            }
        }
    }
    public static boolean leveOrder3(Node root){
        if (root == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (true){
            Node front = queue.poll();
            if (front == null){
                break;
            }
                queue.offer(front.left);
                queue.offer(front.right);

        }
        while (!queue.isEmpty(){
            Node front = queue.poll();
            if (front != null){
                return false;
            }
        }
        return true;
    }
}

