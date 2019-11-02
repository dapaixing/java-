public class Main {
    public static void main(String[] args) {
//         Thread t = new MyThread();
//         t.start();
//         while (true){
//             System.out.println("我这Main中执行");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//        Test run = new Test();
//        Thread t1 = new Thread(run);
//        Thread t2 = new Thread(run);
//        Thread t3 = new Thread(run);
//        t1.start();
//        t2.start();
//        t3.start();
        new Test1().start();
        new Test2().start();
        new Test3().start();

        long num1 = 0;
        for (int i = 0; i < 1000000; i++) {
            num1 += i;
        }
        System.out.println(num1);

        long num2 = 0;
        for (int i = 0; i < 1000000; i=i+2) {
            num2 += i;
        }
        System.out.println(num2);

        long num3 = 0;
        for (int i = 0; i <= 1000000; i++) {
            num3 += (i*i);
        }
        System.out.println(num3);


    }
}
