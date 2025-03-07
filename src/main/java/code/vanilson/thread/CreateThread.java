/**
 * Author: vanilson muhongo
 * Date:06/03/2025
 * Time:09:37
 * Version:2
 */

package code.vanilson.thread;

@SuppressWarnings("all")
public class CreateThread extends Thread {
    @Override
    public void run() {
        System.out.println("Count number : " + countNumber());
    }

    public int countNumber() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count ++;
        }
        return count;
    }
}
