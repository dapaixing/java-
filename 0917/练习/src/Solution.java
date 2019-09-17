//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//        示例:
//
//        给定 nums = [2, 7, 11, 15], target = 9
//
//        因为 nums[0] + nums[1] = 2 + 7 = 9
//        所以返回 [0, 1]
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/two-sum
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] index = new int[2];
        for(int i = 0;i < nums.length ; i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }
}

//给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的并且它们的每个节点只能存储一位数字。
//
//        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//
//        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//
//        示例：
//
//        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//        输出：7 -> 0 -> 8
//        原因：342 + 465 = 807
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/add-two-numbers
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int addNum = 0;
        while(q!=null){
            if(p.next==null && q.next!=null)
                p.next = new ListNode(0);
            if(q.next==null && p.next!=null)
                q.next = new ListNode(0);
            int sumAll = addNum + p.val + q.val;
            p.val = sumAll % 10;
            addNum = sumAll / 10;
            if(p.next == null && q.next == null && addNum!=0)
                p.next = new ListNode(addNum);
            p = p.next;
            q = q.next;
        }
        return l1;
    }
}