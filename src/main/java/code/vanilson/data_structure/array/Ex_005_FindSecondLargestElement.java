package code.vanilson.data_structure.array;


/**
 * Ex_004_CountEvenAndOddNumbers
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-01
 */
@SuppressWarnings("unused")
public class Ex_005_FindSecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        long start = System.nanoTime();
        System.out.println("remove duplicate in array " + (findSecondLargestElement(arr)));
        long end = System.nanoTime();
        System.out.println("Elapsed time: " + (end - start) / 1000000 + " ms ");

    }

    public static int findSecondLargestElement(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int index : arr) {
            if (index > maxValue) {
                maxValue = index;
            }
        }

        return 0;
    }



}

