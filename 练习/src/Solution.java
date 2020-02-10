import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
                k--;
            } else {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        }
        for (int t = 0; t < j + 1; t++) {
            nums1[t] = nums2[t];
        }
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                A[i] *= A[i];
            } else {
                A[i] = ((-A[i]) * (-A[i]));
            }
        }
        Arrays.sort(A);
        return A;
    }

    public String reverseOnlyLetters(String S) {
        char[] arr = S.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        char temp;
        while (i < j) {
            while (!(('a' <= arr[i] && arr[i] <= 'z') || ('A' <= arr[i] && arr[i] <= 'Z')) && i < j) {
                i++;
            }
            while (!(('a' <= arr[j] && arr[i] <= 'z') || ('A' <= arr[j] && arr[i] <= 'Z')) && i < j) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            while (A[i] % 2 == 0 && i < j) {
                i++;
            }
            while (A[j] % 2 == 1 && i < j) {
                j--;
            }
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
        return A;
    }

    public int pivotIndex(int[] nums) {
        int num = 0;
        int aum = 0;
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            num -= nums[i];
            if (num == aum) {
                return i;
            }
            if (i < nums.length) {
                aum += nums[i];
            }
        }
        return -1;
    }

    public int[] plusOne(int[] digits) {
        int i = Integer.valueOf(digits.toString()) + 1;
        String str = Integer.valueOf(i).toString();
        int[] arr = new int[str.length()];
        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(i);
            arr[i] = Integer.valueOf(c);
        }
        return arr;
    }

    public int thirdMax(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a < nums[i]) {
                c = b;
                b = a;
                a = nums[i];
            } else if (b < nums[i]) {
                c = b;
                b = nums[i];
            } else if (c < nums[i]) {
                c = nums[i];
            }
        }
        return c;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(target) != i) {
                return new int[]{i, map.get(temp)};
            }
        }
        return null;
    }

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int temp = 0, i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || temp != 0) {
            if (i >= 0) {
                temp += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                temp += a.charAt(j--) - '0';
            }
            sb.append(temp % 2);
            temp /= 2;
        }
        return sb.reverse().toString();
    }

    public int myAtoi(String str) {
        int i = str.length() - 1;
        int num = 0;
        int temp = 1;
        while (str.charAt(i) != ' ') {
            if (str.charAt(i) == '-') {
                num = -num;
            } else {
                num += (str.charAt(i) - '0') * temp;
                temp *= 10;
            }
        }
        return num;
    }

    public int[] searchRange(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        if (i < 0) return new int[]{-1, -1};
        int begin = i;
        int end = i;
        while (begin - 1 >= 0 && nums[begin - 1] == target) {
            begin--;
        }
        while (end + 1 < nums.length && nums[end + 1] == target) {
            end++;
        }
        return new int[]{begin, end};
    }

    public boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());
    }

    public int compress(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        if (chars == null) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], 1);
        }
        int size = map.size();
        return 2 * size;
    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0, r = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                r = i;
            } else {
                max = nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                l = i;
            } else {
                min = nums[i];
            }
        }
        return r == 0 ? 0 : r - l + 1;
    }

    public int evalRPN(String[] tokens) {
        if (tokens == null)
            return 0;
        int length = tokens.length;
        int result = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        String c;
        int first, second;
        for (int i = 0; i < length; i++) {
            c = tokens[i];
            if (c.equals("+")) {
                second = stack.pop();
                first = stack.pop();
                result = first + second;
                stack.push(result);
            } else if (c.equals("-")) {
                second = stack.pop();
                first = stack.pop();
                result = first - second;
                stack.push(result);
            } else if (c.equals("*")) {
                second = stack.pop();
                first = stack.pop();
                result = first * second;
                stack.push(result);
            } else if (c.equals("/")) {
                second = stack.pop();
                first = stack.pop();
                result = first / second;
                stack.push(result);
            } else {
                result = Integer.parseInt(c);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

    public int longestIncreasingPath(int[][] matrix) {
        //记忆化搜索。
        if (matrix.length == 0) return 0;

        boolean[][] flag = new boolean[matrix.length][matrix[0].length];
        dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                ans = Math.max(ans, dfs(i, j, Integer.MIN_VALUE, matrix, flag));
        return ans;
    }

    int ans = 0;
    int[][] dp;

    int dfs(int x, int y, int last, int[][] matrix, boolean[][] flag) {
        if (!isLegal(x, y, matrix) || flag[x][y] || matrix[x][y] <= last)
            return -1;
        if (dp[x][y] != 0)
            return dp[x][y];

        flag[x][y] = true;
        int ans2 = -1;
        ans2 = Math.max(ans2, dfs(x + 1, y, matrix[x][y], matrix, flag));
        ans2 = Math.max(ans2, dfs(x - 1, y, matrix[x][y], matrix, flag));
        ans2 = Math.max(ans2, dfs(x, y + 1, matrix[x][y], matrix, flag));
        ans2 = Math.max(ans2, dfs(x, y - 1, matrix[x][y], matrix, flag));
        flag[x][y] = false;

        if (ans2 != -1)
            return dp[x][y] = ans2 + 1;
        return dp[x][y] = 1;
    }

    boolean isLegal(int x, int y, int[][] matrix) {
        return x >= 0 && y >= 0 && x < matrix.length && y < matrix[x].length;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            int queueSize = nodeQueue.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode tempNode = nodeQueue.poll();
                if (i == queueSize - 1) {
                    res.add(tempNode.val);
                }

                if (tempNode.left != null) {
                    nodeQueue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodeQueue.add(tempNode.right);
                }
            }
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}