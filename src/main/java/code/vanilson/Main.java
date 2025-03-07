package code.vanilson;

import code.vanilson.thread.CreateThread;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CreateThread();
        // ou
        Thread thread1 = new Thread(new CreateThread());
        thread.setPriority(10);
        thread.start();
        thread1.setDaemon(true);
        thread1.sleep(5000); // jvm coloca a thread em sleeping
        thread1.start();
        System.out.println("Main thread started : " + Thread.currentThread().getName());


    }
}