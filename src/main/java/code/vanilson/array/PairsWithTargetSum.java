/**
 * Author: vanilson muhongo
 * Date:02/06/2025
 * Time:20:09
 * Version:1
 */

package code.vanilson.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairsWithTargetSum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 7, 1, 5};
        System.out.println(Arrays.toString(getAllPairsWithSum(numbers, 6)));
    }

        public static int[] getAllPairsWithSum(int[] numbers, int target) {
            int[] aux = new int[numbers.length * (numbers.length - 1)]; // espaço suficiente
            int pos = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        aux[pos] = numbers[i];
                        aux[pos + 1] = numbers[j];
                        pos += 2;
                    }
                }
            }

            return Arrays.copyOf(aux, pos); // retorna só a parte preenchida
        }

    public static List<int[]> findPairsWithSum(int[] array, int target) {
        Set<Integer> seen = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (int num : array) {
            int complement = target - num;
            if (seen.contains(complement)) {
                pairs.add(new int[]{complement, num});
            }
            seen.add(num);
        }

        return pairs;
    }
    }


