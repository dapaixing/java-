public class Contact {
    public static class Node{
        String name;
        String phone;

        Node left;
        Node right;
    }

    private Node root = null;

    public boolean insert(String name,String phone){
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.phone == phone ){
                return false;
            }else if ()
        }
    }
}
