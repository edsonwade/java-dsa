/**
 * Author: vanilson muhongo
 * Date:02/05/2025
 * Time:20:50
 * Version:1
 */

package code.vanilson.array;

public class MoreFrequentElementInArray {
    public static void main(String[] args) {
        int[] numbers = {123, 4, 56, 7, 8, 9, 6, 5, 4, 3, 123, 56, 6, 7, 5, 8, 3, 2, 9, 5, 6, 5};
        int[] number = {1, 2, 2, 3, 2, 4};
        int target = 2;
        System.out.println("The more frequente element is :" + findMoreFrequentElementInArray(numbers));
        System.out.println("The less frequente element is :" + findLessFrequentElementInArray(numbers));
        System.out.println("The number of frequency that" + target + " appear in array is : " + countFrequentElementInArray(number, 2));

    }

    static int findMoreFrequentElementInArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int maxValue = Integer.MIN_VALUE;
        int moreFrequent = numbers[0];

        for (int index : numbers) {
            int count = 0; // count the number of occurrence
            for (int posix : numbers) {
                if (index == posix) {
                    // update the count with the  of occurrence
                    count++;
                }
                if (count > maxValue) {
                    maxValue = count;
                    moreFrequent = index;
                }
            }

        }
        return moreFrequent;

    }

    static int countFrequentElementInArray(int[] numbers, int number) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int count = 0;
        for (int index : numbers) {
            if (index == number) {
                count++;
            }
        }
        return count;

    }

    static int findLessFrequentElementInArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null neither empty");
        }
        int minValue = Integer.MAX_VALUE;
        int lessFrequent = numbers[0];

        for (int index : numbers) {
            int count = 0; // count the number of occurrence
            for (int posix : numbers) {
                if (index == posix) {
                    // update the count with the  of occurrence
                    count++;
                }
            }

            if (count < minValue) {
                minValue = count;
                lessFrequent = index;
            }
        }
        return lessFrequent;

    }


}
