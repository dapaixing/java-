package Lambda表达式;

public class LambdaThread {
    static class Test implements Runnable {
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println("一边听歌");
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Test()).start();

        class Test2 implements Runnable {
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边听歌");
                }
            }
        }
        new Thread(new Test2()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("一边听歌");
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("一边听歌");
            }
        }).start();
    }
}
