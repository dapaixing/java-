//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Test {
//    public void levelOrder(Node root){
//        if (root == null){
//            return;
//        }
//        Queue<NodeLevel> queue = new LinkedList<>();
//        queue.offer(new NodeLevel(root,1));
//        while (!queue.isEmpty()){
//            NodeLevel front  = queue.poll();
//            System.out.println(front.level+":"+front.node.val);
//            if (front.node.left != null){
//                queue.offer(front.node.left,front.level + 1);
//            }
//            if (front.node.right != null) {
//                queue.offer(front.node.right, front.level + 1);
//            }
//        }
//    }
//}
