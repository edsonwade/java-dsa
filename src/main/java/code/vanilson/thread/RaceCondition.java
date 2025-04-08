package code.vanilson.thread;

/**
 * RaceCondition
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class RaceCondition implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("RaceCondition: " + count++);
        }
    }

    // Método sincronizado para garantir acesso exclusivo
    private synchronized void incrementCount() {
        System.out.println("RaceCondition: " + count++);
    }
}