package AtividadeThread;

public class TestThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Ola");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("mundo");
        });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread 1 erro");
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread 2 erro");
        }
    }
}
