/**
 * Author: vanilson muhongo
 * Date:05/03/2025
 * Time:21:09
 * Version:1
 */

package code.vanilson.thread.interrupt;

@SuppressWarnings("all")
public class ThreadDaemon {
    public static void main(String[] args) {
        Thread threadA = new Thread(new DaemonTask());
        threadA.setDaemon(true);  // Daemon thread
        threadA.start();

        Thread threadB = new Thread(new NonDaemonTask());
        threadB.setDaemon(false);  // Non-daemon thread
        threadB.start();

        // Main thread finishes, but Thread B will keep running since it's a non-daemon thread
        System.out.println("Main thread is ending. Thread B is still running.");
    }

    private static class DaemonTask implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Daemon thread is running...");
                Thread.sleep(2000);  // Simulate some work for 2 seconds
                System.out.println("Daemon thread finished.");
            } catch (InterruptedException e) {
                System.out.println("Daemon thread was interrupted.");
            }
        }
    }

    private static class NonDaemonTask implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("Non-daemon thread is running...");
                Thread.sleep(5000);  // Simulate some work for 5 seconds
                System.out.println("Non-daemon thread finished.");
            } catch (InterruptedException e) {
                System.out.println("Non-daemon thread was interrupted.");
            }
        }
    }
}
