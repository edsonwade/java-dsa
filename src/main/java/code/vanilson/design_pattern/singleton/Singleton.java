package code.vanilson.design_pattern.singleton;

/**
 * Singleton
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
@SuppressWarnings("all")
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(); // Obtém a instância única
        System.out.println("s1 = " + s1.getClass().getName());
        Singleton s2 = Singleton.getInstance();
        synchronized (s2) {
            System.out.println("s2 = " + s2.getClass().getSuperclass());
        }
    }
}