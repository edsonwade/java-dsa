package code.vanilson.data_structure.array;

import java.util.Arrays;

/**
 * Ex_001
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-01-27
 */
public class Ex_001 {

    public static void main(String[] args) {
        //initialize an array with values
        //[132, 14641, 20736, 361, 25921, 361, 20736, 361]
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11}; // 5 is the size of the array
        int[] b = {132, 14641, 20736, 361, 25921, 361, 20736, 361}; // 5 is the size of the array
        System.out.println("The result is : " + compWrongImplementation(a, b));
        long start = System.currentTimeMillis();

        System.out.println("The result is : " + compBetterApproach(a, b));

        long end = System.currentTimeMillis();

        System.out.println("The time taken is : " + (end - start));
    }

    /**
     * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
     * Examples
     * Valid arrays
     * <p>
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
     * <p>
     * comp(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:
     * <p>
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19]
     * <p>
     * Invalid arrays
     * <p>
     * If, for example, we change the first number to something else, comp is not returning true anymore:
     * <p>
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
     * <p>
     * comp(a,b) returns false because in b 132 is not the square of any number of a.
     * <p>
     * a = [121, 144, 19, 161, 19, 144, 19, 11]
     * b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
     * <p>
     * comp(a,b) returns false because in b 36100 is not the square of any number of a.
     */
    public static boolean compWrongImplementation(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int index_a : a) {
            for (int index_b : b) {
                if (index_b % index_a == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean compBetterApproach(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        return Arrays.equals(
                Arrays.stream(a).map(x -> x * x).sorted().toArray(),
                Arrays.stream(b).sorted().toArray()
        );
    }

}