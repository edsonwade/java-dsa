package code.vanilson.thread;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Main {

    public static void main(String[] args) {
        Deadlocks deadlocks = new Deadlocks();
//        Thread thread1 = new Thread(deadlocks::methodA);
//        Thread thread2 = new Thread(deadlocks::methodB);
//
//        thread1.start();
//        thread2.start();

        RaceCondition raceCondition = new RaceCondition();
        Thread thread3 = new Thread(raceCondition);
        Thread thread4 = new Thread(raceCondition);
        thread3.start();
        thread4.start();
    }

}
