/**
 * Author: vanilson muhongo
 * Date:05/03/2025
 * Time:20:06
 * Version:1
 */

package code.vanilson.thread.interrupt;

@SuppressWarnings("all")
public class InterruptThread {

    public static void main(String[] args) {
        System.out.println("Starting thread");
        Thread thread1 = new Thread(new BlockingThread());
        thread1.start();
        thread1.interrupt(); // comment this line and the thread will stil runining

        Thread thread2 = new Thread(new NonBlockingThread());
        thread2.start();

    }

    private static class BlockingThread implements Runnable {
        @Override
        public void run() {

            try {
                Thread.sleep(500000000000000000L);
            } catch (InterruptedException e) {
                System.out.println("Executing thread 1 interrupt ");

            }


        }
    }

    private static class NonBlockingThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Still executing thread 2 .........");

        }
    }
}
