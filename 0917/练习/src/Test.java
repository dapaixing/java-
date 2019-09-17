import java.util.ArrayList;
import java.util.List;

public class Test {
    //    给定一个二叉树，返回它的 后序 遍历。
//
//    示例:
//
//    输入: [1,null,2,3]
//            1
//            \
//            2
//            /
//            3
//
//    输出: [3,2,1]
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public List<Integer> LinkedList = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);

        List<Integer> list = new ArrayList<>();
        list.addAll(left);
        list.addAll(right);
        list.add(root.val);
        return list;
    }

    //    给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
//
//    示例 1:
//    给定的树 s:
//
//            3
//            / \
//            4   5
//            / \
//            1   2
//    给定的树 t：
//
//            4
//            / \
//            1   2
//    返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
//
//    示例 2:
//    给定的树 s：
//
//            3
//            / \
//            4   5
//            / \
//            1   2
//            /
//            0
//    给定的树 t：
//
//            4
//            / \
//            1   2
//    返回 false。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/subtree-of-another-tree
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean isSubtree(TreeNode s, TreeNode t) {
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
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    //    给定两个二叉树，编写一个函数来检验它们是否相同。
//
//    如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
//
//    示例 1:
//
//    输入:       1         1
//            / \       / \
//            2   3     2   3
//
//            [1,2,3],   [1,2,3]
//
//    输出: true
//    示例 2:
//
//    输入:      1          1
//            /           \
//            2             2
//
//            [1,2],     [1,null,2]
//
//    输出: false
//    示例 3:
//
//    输入:       1         1
//            / \       / \
//            2   1     1   2
//
//            [1,2,1],   [1,1,2]
//
//    输出: false
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/same-tree
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
//    给你一个正整数的数组 A（其中的元素不一定完全不同），请你返回可在 一次交换（交换两数字 A[i] 和 A[j] 的位置）后得到的、按字典序排列小于 A 的最大可能排列。
//
//    如果无法这么操作，就请返回原数组。
//
//             
//
//    示例 1：
//
//    输入：[3,2,1]
//    输出：[3,1,2]
//    解释：
//    交换 2 和 1
//             
//
//    示例 2：
//
//    输入：[1,1,5]
//    输出：[1,1,5]
//    解释：
//    这已经是最小排列
// 
//
//    示例 3：
//
//    输入：[1,9,4,6,7]
//    输出：[1,7,4,6,9]
//    解释：
//    交换 9 和 7
//             
//
//    示例 4：
//
//    输入：[3,1,1,3]
//    输出：[1,3,1,3]
//    解释：
//    交换 1 和 3
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/previous-permutation-with-one-swap
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] prevPermOpt1(int[] A) {
        for (int i = A.length - 2;i>= 0;i--){
            if (A[i] > A[i+1]){
                int tmp = i+1;
                for (int j = i+2;j<A.length;j++){
                    if (A[j] < A[i] && A[j] > A[tmp]){
                        tmp = j;
                    }
                }
                int tmpe = A[tmp];
                A[tmp] = A[i];
                A[i] = tmpe;
                break;
            }
        }
        return A;
    }
}
