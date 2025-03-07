/**
 * Author: vanilson muhongo
 * Date:06/03/2025
 * Time:11:22
 * Version:1
 */

package code.vanilson.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@SuppressWarnings("all")
public class CallableFuture implements Callable<Integer> {
    @Override
    public Integer call() {
        String number = "123000";
        return Integer.sum(Integer.parseInt(number), 1000_000);
    }

    public static void main(String[] args) {
        CallableFuture callableFuture = new CallableFuture();
        FutureTask<Integer> randomNumberTasks = new FutureTask<>(callableFuture);
        Thread thread = new Thread(randomNumberTasks);
        thread.setDaemon(true);
        thread.start();
        System.out.println("Main thread exiting : " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // 3 segundos
            System.out.println("Total sum is : " + randomNumberTasks.get());
        } catch (ExecutionException | InterruptedException e) {
            System.err.println("Exception caught: " + e);
        }
    }
}
