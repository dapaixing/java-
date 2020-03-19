package p1;

import java.util.Arrays;

public class 堆排 {
    public static void main(String[] args) {
        int [] arr = {3,9,-1,-2,20};
        heapSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        creaHeap(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            swp(arr,0,arr.length-i-1);
            shiftDown(arr,0,arr.length-i-1);
        }
    }
    private static void creaHeap(int[] arr){
        for (int i = (arr.length-1)/2;i>=0;i--){
            shiftDown(arr,i,arr.length);
        }
    }
    private static void shiftDown(int[] arr,int index,int size){
        int left = 2*index+1;
        while (left<size){
            int max = left;
            int right = left+1;
            if (right<size){
                if (arr[right]>arr[left]){
                    max = right;
                }
            }
            if (arr[max]<=arr[index]){
                break;
            }
            swp(arr,max,index);
            index = max;
            left = index*2+1;
        }
    }
    private static void swp(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    private static void heapSort2(int[] arr){
        creaHeap2(arr);
        for (int i = 0; i < arr.length-1; i++) {
            swp(arr,0,arr.length-1-i);
            shiftDown2(arr,0,arr.length-1-i);
        }
    }
    private static void creaHeap2(int[] arr){
        for (int i = (arr.length-1)/2;i>=0;i--){
            shiftDown2(arr,i,arr.length);
        }
    }
    private static void shiftDown2(int [] arr,int index,int size){
        int left = 2*index+1;
        while (left<size){
            int right = left+1;
            int max = left;
            if (right<size) {
                if (arr[left] < arr[right]) {
                    max = right;
                }
            }
            if (arr[max]<=arr[index]){
                break;
            }
            swp(arr,max,index);
            index = max;
            left = 2*index+1;
        }
    }
}
//public class Solution {
//    TreeNode pre=null;
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree==null)
//            return null;
//        Convert(pRootOfTree.right);
//        if(pre==null)
//            pre=pRootOfTree;
//        else{
//            pRootOfTree.right=pre;
//            pre.left=pRootOfTree;
//            pre=pRootOfTree;
//        }
//        Convert(pRootOfTree.left);
//        return pre;
//    }
//}

