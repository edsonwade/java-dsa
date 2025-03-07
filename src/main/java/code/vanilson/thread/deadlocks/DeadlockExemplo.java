/**
 * Author: vanilson muhongo
 * Date:06/03/2025
 * Time:19:30
 * Version:1
 */

package code.vanilson.thread.deadlocks;
@SuppressWarnings("all")
public class DeadlockExemplo {
    private final Object recurso1 = new Object();
    private final Object recurso2 = new Object();

    public void metodo1() {
        synchronized (recurso1) {
            System.out.println(Thread.currentThread().getName() + " bloqueou recurso1");
            try {
                Thread.sleep(50); // Simula alguma operação
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (recurso2) {
                System.out.println("Método 1 executado.");
            }
        }
    }

    public void metodo2() {
        synchronized (recurso2) {
            System.out.println(Thread.currentThread().getName() + " bloqueou recurso2");
            try {
                Thread.sleep(50); // Simula alguma operação
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (recurso1) {
                System.out.println("Método 2 executado.");
            }
        }
    }

    public static void main(String[] args) {
        DeadlockExemplo deadlock = new DeadlockExemplo();

        Thread t1 = new Thread(deadlock::metodo1, "Thread-1");
        Thread t2 = new Thread(deadlock::metodo2, "Thread-2");

        t1.start();
        t2.start();
    }
}

