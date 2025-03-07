/**
 * Author: vanilson muhongo
 * Date:06/03/2025
 * Time:10:14
 * Version:2
 */

package code.vanilson.thread;
@SuppressWarnings("all")
public class CreateThreadRunnable implements Runnable {
    @Override
    public void run() {
        String names = "vanilson";
        for (int i = 0; i < names.length(); i++) {
            char c = names.charAt(i);
            System.out.print("\t" + c);

        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThreadRunnable());
        thread.start();
        System.out.println("Create Thread Main : " + Thread.currentThread().getName());

//        Thread thread1 = new Thread(() -> {
//
//            String names = new StringBuilder()
//                    .append("java")
//                    .reverse()
//                    .toString();
//
//
//            String names1 = "java";
//            if (names.equals(names1)) {
//                System.out.println("Thread is alive");
//            } else {
//                System.out.println("Thread is dead");
//            }
//        });
//        thread1.start();
//
//    }
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // peep, deed , civic,mom,rotator,deified
                String words = "civic";
                String reverseWords;
                reverseWords = new StringBuilder(words)
                        .reverse()
                        .toString();
                if (reverseWords.equals(words)) {
                    System.out.println("Is palindrome ");
                } else {
                    System.out.println("Not palindrome ");
                }

            }
        });
        thread1.start();

    }
}
