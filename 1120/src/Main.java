//import java.util.*;
//public class Main{
//    public static void main(String args[]){
//        Scanner s = new Scanner(System.in);
//        int cols = s.nextInt();
//        String c = s.next();
//        int rows = (cols+1)/2;
//        int [][] arr = new int[rows][cols];
////        for(int i = 0 ; i < cols ; i++){
////            System.out.print(c);
////        }
////        System.out.print('\n');
////        for(int i = 0 ; i < rows-2;i++){
////            System.out.print(c);
////            for(int j = 0 ; j < cols - 2 ; j++){
////                System.out.print(" ");
////            }
////            System.out.print(c);
////            System.out.print('\n');
////        }
////        for(int i = 0 ; i < cols ; i++){
////            System.out.print(c);
////        }
//        for (int i = 0;i<cols;i++){
//            arr[0][i] = 1;
//            arr[rows-1][i] = 1;
//        }
//        for (int i = 0;i<rows;i++){
//            arr[i][0] = 1;
//            arr[i][cols - 1] = 1;
//        }
//        for (int i = 0; i < rows; i++) {
//            for (int i1 = 0; i1 < cols; i1++) {
//                if(arr[i][i1] == 1){
//                    System.out.print(c);
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();


            int lenA = a.length();
            int lenB = b.length();
            int lenS = Math.max(lenA, lenB);


            int[] arrA = new int[lenS];
            int[] arrB = new int[lenS];
            int[] arrS = new int[lenS + 1];

            for (int i = 0; i < lenA; i++) {
                arrA[i] = a.charAt(lenA - 1 - i) - '0';
            }

            for (int i = 0; i < lenB; i++) {
                arrB[i] = b.charAt(lenB - 1 - i) - '0';
            }

            for (int i = 0; i < lenS; i++) {
                int sum = arrS[i] + arrA[i] + arrB[i];
                int flag = sum /10;
                arrS[i]  = sum % 10;
                arrS[i+1] += flag;
            }

            for (int i = arrS[lenS] == 0?1:0; i < lenS + 1; i++) {
                System.out.print(arrS[lenS - i]);
            }

            System.out.println();

        }

        sc.close();
    }

}
