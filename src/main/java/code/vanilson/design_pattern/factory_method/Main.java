package code.vanilson.design_pattern.factory_method;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-07
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        DogFactory dogFactory = new DogFactory();

        Animal cat = catFactory.createAnimal();
        Animal dog = dogFactory.createAnimal();

        Thread thread1 = new Thread(cat::makeNoise, "Thread-1");
        Thread thread2 = new Thread(dog::makeNoise, "Thread-2");

        // Start thread2 first
        thread2.start();

        // Sleep thread1 for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread now interrupted");
        }

        // Start thread1 after the sleep
        thread1.setDaemon(true);
        thread1.start();
    }

}