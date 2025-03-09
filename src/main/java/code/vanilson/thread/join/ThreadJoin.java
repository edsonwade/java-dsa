package code.vanilson.thread.join;

/**
 * Método Join() → é usado para bloquear a thread que o chama até que a thread na qual join() foi chamado termine a sua
 * execução.
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simula um trabalho que leva 2 segundos
                System.out.println("Thread 1 concluída.");
            } catch (InterruptedException e) {
                System.err.println("Thread 1 interrompida.");
                Thread.currentThread().interrupt();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000); // Simula um trabalho que leva 1 segundo
                System.out.println("Thread 2 concluída.");
            } catch (InterruptedException e) {
                System.err.println("Thread 2 interrompida.");
                Thread.currentThread().interrupt();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Bloqueia até que thread1 termine
            thread2.join(); // Bloqueia até que thread2 termine
        } catch (InterruptedException e) {
            System.err.println("Thread principal interrompida.");
            Thread.currentThread().interrupt();
        }

        System.out.println("Ambas as threads foram concluídas.");
    }
}
