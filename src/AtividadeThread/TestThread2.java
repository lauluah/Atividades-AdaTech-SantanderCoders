package AtividadeThread;

public class TestThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
            } catch (Exception e) {
                System.out.println("Thread 1 interrompida");
            }
        });

        thread.start();
    }
}
