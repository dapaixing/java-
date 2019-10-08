public class BinaraySearchTree {
    public static class Node{
        int key;
        Node left = null;
        Node right = null;

        public Node(int key) {
            this.key = key;
        }
    }

    public static void main(String[] args) {

    }
    private static Node root = null;
    public static Node search(int key){
        Node cur = root;
        while (cur != null){
            if (key == cur.key){
                return cur;
            }else if (key<cur.key){
                cur = cur.left;
            }else {
                cur = cur.right;
            }
        }
        return null;
    }
//    public static Node search(int key){
//        if ()
//    }
    public boolean insert(int key){
        Node cur = root;
        Node parent = null;
        while (cur != null){}
        if (key == cur.key){
            return false;
        }else if (key<cur.key){
            parent = cur;
            cur = cur.left;
        }else {
            parent = cur;
            cur = cur.right;
        }
        Node node = new Node(key);
        if (key<parent.key){
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }
}
