import javax.xml.bind.NotIdentifiableEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class BinaryTree {
    private static class Node {
        private int val;
        private Node left = null;
        private Node right = null;

        public Node(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("{%c}", val);
        }
    }

    public static void main(String[] args) {
        Node root = buildTree();
        //preOrderTraversal(root);
        inOrderTraversal(root);
    }

    public static Node buildTree() {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.right = h;
        c.left = f;
        c.right = g;
        return a;
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root);
        inOrderTraversal(root.right);
    }

    public static void postOradeTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root);
    }

    private static int count = 0;

    public static void getSize(Node root) {
        if (root == null) {
            return;
        }
        count++;
        getSize(root.left);
        getSize(root.right);
    }

    public static int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        int left = getSize2(root.left);
        int right = getSize2(root.right);
        return left + right + 1;
    }

    public static List<Integer> preOrderTraversal1(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> left = preOrderTraversal1(root.left);
        List<Integer> right = preOrderTraversal1(root.right);

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(left);
        list.addAll(right);

        return list;
    }

    List<Integer> list = new LinkedList<Integer>();

    public List<Integer> inorderTraversal(Node root) {
        if (root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public int getHeight(Node root) {
        return root == null ? 0 : Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public static int getKlevel(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKlevel(root.left, k - 1) + getKlevel(root.right, k - 1);
    }

    public static Node find(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        Node n = find(root.left, val);
        if (n != null) {
            return n;
        }
        Node m = find(root.right, val);
        if (m != null) {
            return m;
        }
        return null;
    }

    public static boolean find2(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.val == val) {
            return true;
        }
        boolean n = find2(root.left, val);
        if (n) {
            return true;
        }
        boolean m = find2(root.right, val);
        if (m) {
            return true;
        }
        return false;
    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public boolean isMirrorTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null && p.val == q.val) {
            return isMirrorTree(p.left, q.right) && isMirrorTree(p.right, q.left);
        } else {
            return false;
        }
    }

    public boolean isSubtree(Node s, Node t) {
        if (s == null && t == null) {
            return true;
        }
        if (s != null && t == null) {
            return true;
        }
        if (s == null && t != null) {
            return false;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    boolean flag=true;
    public boolean isBalanced(Node root) {
        postSearch(root);
        return flag;
    }
    public int postSearch(Node root){
        if(root==null||!flag) return 0;
        int left=postSearch(root.left);
        int right=postSearch(root.right);
        if(Math.abs(left-right)>1) flag=false;
        return Math.max(left,right)+1;
    }
}
