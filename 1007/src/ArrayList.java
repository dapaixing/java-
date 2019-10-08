class Node {
    int val;
    Node next = null;

    public Node(int val) {
        this.val = val;
    }

    public String toString() {
        return String.format("Node(%d)", val);
    }
}

public class ArrayList {
    public static void main(String[] args) {
        Node head = null;
        head = pushFront(head, 1);
        head = pushFront(head, 1);
        head = pushFront(head, 2);
        head = pushFront(head, 0);
        head = pushFront(head, 2);
//        head = reverseList(head);
//        for (Node cur = head; cur != null; cur = cur.next) {
//            System.out.println(cur);
//        }
        print(head);
    }

    //头插
    private static Node pushFront(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    //尾插
    private static Node pushBack(Node head, int val) {
        Node node = new Node(val);
        if (head == null) {
            return node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
            return head;
        }
    }

    //头删
    private static Node popFront(Node head) {
        if (head == null) {
            System.out.println("链表为空，不能删除");
            return null;
        }

        return head.next;

    }

    //尾删
    private static Node popBack(Node head) {
        if (head == null) {
            System.out.println("链表为空，不能删除");
            return null;
        }
        if (head.next == null) {
            head = null;
            return null;
        } else {
            Node last = head;
            while (last.next.next != null) {
                last = last.next;
            }
            last.next = null;
            return head;
        }
    }

    //打印
    private static void print(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur);
        }
    }

    //反转链表
    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node p3 = head;
        while (p2 != null){
            p3.next = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3.next;
        }
        return p1;
    }

    //将给定数据插入指定节点
    private static void pushAfter(Node pos, int val) {
        Node node = new Node(val);
        node.next = pos.next;
        pos.next = node;

    }

    //删除链表中值为指定数据的所以节点
    public static Node removeElements(Node head, int val) {
        if (head == null){
            System.out.println("链表为空不能删除");
            return null;
        }
        Node last = null;
        Node cur = head;

        while (cur != head){
            if (cur.next.val == val){
                last = cur;
                last.next = cur.next.next;
                cur = last.next;
            }else {
                last = cur;
                cur = cur.next;
            }
        }
        if (head.val == val){
            head = head.next;
        }
        return head;
    }

}
