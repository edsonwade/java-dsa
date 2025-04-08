package code.vanilson.thread.sincro.solution;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicSyncronized
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@SuppressWarnings("all")
public class AtomicSyncronized {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public void increment() {
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return atomicInteger.get();
    }

    public static void main(String[] args) throws InterruptedException {
        var syncronized = new AtomicSyncronized();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                syncronized.increment();
            }

        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                syncronized.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter final: " + syncronized.getCount());

    }
}