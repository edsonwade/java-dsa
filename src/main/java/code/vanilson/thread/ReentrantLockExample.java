package code.vanilson.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLockExample
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@SuppressWarnings("all")
public class ReentrantLockExample {
    private int counter = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Adquire o bloqueio
        try {
            counter++; // Seção crítica
        } finally {
            lock.unlock(); // Libera o bloqueio
        }
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample example = new ReentrantLockExample();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter final value: " + example.getCounter());
    }
}
