public class TestThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("oui");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("non");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        System.out.println(t1.getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t2.getPriority());
        t1.join();
        t2.join();

        System.out.println("fini");
    }
}


