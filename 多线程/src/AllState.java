public class AllState {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("....");
            }
        });
        Thread.State state = t.getState();
        System.out.println(state);

        t.start();
        state = t.getState();
        System.out.println(state);

        while (state != Thread.State.TERMINATED){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            System.out.println(state);
        }
        state = t.getState();
        System.out.println(state);
    }
}
