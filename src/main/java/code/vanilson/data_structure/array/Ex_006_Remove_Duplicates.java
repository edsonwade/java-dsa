package code.vanilson.data_structure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Ex_006_Remove_Duplicates
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-01
 */
@SuppressWarnings("all")
public class Ex_006_Remove_Duplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        long start = System.nanoTime();
        System.out.println(
                "remove duplicate elements in array " +
                        Arrays.toString(removeDuplicatesElementInArrayStreams(arr)));
        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + " ms ");
    }

    private static int[] removeDuplicatesElementInArrayUsingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int index : arr) {
            set.add(index);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] removeDuplicatesElementInArrayStreams(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return Arrays.stream(arr)
                .distinct()
                .toArray();
    }
}