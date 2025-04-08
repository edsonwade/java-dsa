package code.vanilson.thread.sincro;

/**
 * NoSynchronizedRaceCondition
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@SuppressWarnings("all")
public class NoSynchronizedRaceCondition {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        var s = new NoSynchronizedRaceCondition();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                s.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                s.increment();
            }
        });
        t1.start();
        t2.start();
        // Para garantir que o programa não termine antes da thread
        t1.join();
        t2.join();

        System.out.println("Counter final value: " + s.getCounter());
    }
}