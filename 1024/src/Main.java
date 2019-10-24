import java.util.*;
public class Main {
    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        int num = 0;
        for(int i = 0;i<length;i++){
            if(str.charAt(i) == ' '){
                num++;
            }
        }
        int newlength = length + num * 2;
        int left = length - 1;
        int right = newlength - 1;
        str.setLength(newlength);
        char[] ch = str.toCharArray();
        for(int i = left; i >= 0;i--){
            if(ch[i] != ' '){
                ch[right] = ch[i];
                right--;
            }else{
                ch[right] = '%';
                ch[right - 1] = '0';
                ch[right - 2] = '2';
                right = right - 3;
            }
        }
        return ch.toString();
    }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.peek();
            if((curr.left == null && curr.right == null) ||(pre != null && (pre == curr.left || pre == curr.right))){
                res.add(curr.val);
                pre = curr;
                stack.pop();
            }else{
                if(curr.right != null) stack.push(curr.right);
                if(curr.left != null) stack.push(curr.left);
            }
        }
        return res;
    }
}
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null){
            return list;
        }
        ListNode pre = listNode;
        ListNode cur = listNode;
        ListNode next = listNode.next;
        while(next != null){
            cur.next = next.next;
            next.next = pre;
            pre = next;
            next = cur.next;
        }
        while(pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}
public class Solution {
    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                spacenum++;
        }
        int indexold = str.length()-1;
        int newlength = str.length() + spacenum*2;
        int indexnew = newlength-1;
        str.setLength(newlength);
        for(;indexold>=0 && indexold<newlength;--indexold){
            if(str.charAt(indexold) == ' '){
                str.setCharAt(indexnew--, '0');
                str.setCharAt(indexnew--, '2');
                str.setCharAt(indexnew--, '%');
            }else{
                str.setCharAt(indexnew--, str.charAt(indexold));
            }
        }
        return str.toString();
    }
}
