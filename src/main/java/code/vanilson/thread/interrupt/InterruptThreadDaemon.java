/**
 * Author: vanilson muhongo
 * Date:05/03/2025
 * Time:20:07
 * Version:1
 */

package code.vanilson.thread.interrupt;


import java.util.logging.Logger;

@SuppressWarnings("all")

public class InterruptThreadDaemon {
    private static final Logger logger = Logger.getLogger(InterruptThreadDaemon.class.getName());

    public static void main(String[] args) {
        logger.info("Starting threads");

        Thread thread1 = new Thread(new BlockingThread());
        thread1.setDaemon(true);  // Daemon thread
        thread1.start();

        // Main thread finishes, and the JVM will automatically shut down daemon threads
        System.out.println("Main thread is ending. Daemon thread may still be running or will be stopped by JVM.");

        // Create and start the NonBlockingThread
        Thread thread2 = new Thread(new NonBlockingThread());
        thread2.start();

    }

    private static class BlockingThread implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Thread 1 is sleeping for 5 seconds...");
                // Simulate a blocking operation
                Thread.sleep(5000);  // This will block until interrupted or completed
                System.out.println("Thread 1 completed.");
            } catch (InterruptedException e) {
                // You don't need to manually handle interruptions for daemon threads,
                // because the JVM will terminate daemon threads automatically when the main thread ends.
                System.out.println("Thread 1 was interrupted during sleep!");
            }
        }
    }

    // Simulate a non-blocking thread that is not interrupted
    private static class NonBlockingThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread 2 is executing without blocking...");
        }
    }
}


