class Node{
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }

    public String toString(){
        return String.format("Node(%d)",val);
    }
}
public class ArrayList {
    public static void main(String[] args) {
        Node head = null;
        head = pushFront(head,0);
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,0);
        head = pushFront(head,0);
        for(Node cur = head;cur != null;cur = cur.next){
            System.out.println(cur);
        }
    }

    //头插
    private static Node pushFront(Node head,int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        return head;
    }
    //尾插
    private static Node pushBack(Node head,int val){
        Node node = new Node(val);
        if (head == null){
            return node;
        }else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
            return head;
        }
    }

    //头删
    private static Node popFront(Node head){
        if (head == null){
            System.out.println("链表为空，不能删除");
            return null;
        }

        return head.next;

    }

    //尾删
    private static Node popBack(Node head){
        if (head == null){
            System.out.println("链表为空，不能删除");
            return null;
        }
        if (head.next == null){
            head = null;
            return null;
        }else {
            Node last = head;
            while (last.next.next != null){
                last = last.next;
            }
            last.next = null;
            return head;
        }
    }
}
