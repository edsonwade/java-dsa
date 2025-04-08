package code.vanilson.thread;

/**
 * Deadlocks
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
@SuppressWarnings("all")
class Deadlocks {
    StringBuilder stringBuilder = new StringBuilder("Hello World");

    public synchronized void methodA() {
        stringBuilder.append(" A");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Deadlocks thread interrupted");
        }

        methodB();
    }

    public synchronized void methodB() {
        stringBuilder.append(" B");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Deadlocks thread interrupted int method A");
        }
        methodA();

    }

}