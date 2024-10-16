package AtividadeThread;

public class TestThread3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(STR."Par: \{i}");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(STR."Impar: \{i}");
                }
            }
        });

        thread.start();
        thread2.start();

    }
}
