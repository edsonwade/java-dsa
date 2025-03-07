/**
 * Author: vanilson muhongo
 * Date:06/03/2025
 * Time:19:19
 * Version:1
 */

package code.vanilson.thread.race_condition;

@SuppressWarnings("all")
public class Counter {
    private int count = 0;

    // sem sincronização pode causar race condition
    public void increment() {
        try {
            Thread.sleep(5000000);
            for (int i = 0; i < 1000_000_000; i++) {
                count++;
            }

            System.out.println("Counter with race condition: " + count);
        } catch (InterruptedException e) {
            System.err.println("Counter interrupted race condition");
        }
    }

    public synchronized void incrementSecurity() {
        for (int i = 0; i < 1000_000_000; i++) {
            count++;
        }
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(() -> {
            counter.increment();
        });
        thread.setDaemon(true);
        thread.start();

        Thread thread2 = new Thread(() -> {
            counter.incrementSecurity();
            System.out.println("Counter no race condition: " + counter.getCount());
        });
        thread2.start();


    }
}
