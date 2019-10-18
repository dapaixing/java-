public class Test {
    public static void main(String[] args) {
        int[] array = {2, -2, -3, -4, 1};
        if (array.length == 0)
            System.out.println(0);
        else {
            int temp = array[0];
            int num = array[0];;
            for (int i = 1; i < array.length; i++) {
                if (temp >= 0)
                    temp += array[i];
                else
                    temp = array[i];
                if (temp > num)
                    num = temp;
            }
            System.out.println(num);
        }
    }
}
