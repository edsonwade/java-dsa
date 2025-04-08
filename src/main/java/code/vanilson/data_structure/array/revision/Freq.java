package code.vanilson.data_structure.array.revision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Freq
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-03
 */
@SuppressWarnings("all")
public class Freq {
    public static void main(String[] args) {
        int[] freq = {12, 13, 12, 13, 4, 34, 56, 34, 56, 56};
        int[] newArr = {1, 2, 3, 2, 1};
        String words = "aeeaaioouu";

        System.out.println("More frequent element is " + findMoreFrequentElementInArray(freq));
        System.out.println("More frequent element is " + findLessFrequentElementInArray(freq));
        System.out.println();
        System.out.println("less frequent element and more frequent " +
                Arrays.toString(findLessAndMoreFrequentElementsInArray(freq)));

        System.out.println(countOccurenceNumberOfEachString(words));

        System.out.println("new arrays : " + Arrays.toString(removeDuplicateElementInArrayStreams(freq)));
        System.out.println("new set : " + Arrays.toString(removeDuplicateElementInUsandoColection(freq)));

        System.out.println("Is palindorme ? " + isArrayPalindrome(newArr));
        System.out.println("reverso ? " + Arrays.toString(isArrayReveresed(freq)));
        System.out.println("reverso new ? " + Arrays.toString(invertArrayUsingForEach(freq)));
        readFiles("data/data.txt");
    }

    private static int findMoreFrequentElementInArray(int[] arr) {
        // verificar se o array é nulo ou vazio
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }

        //Declarar variaveis
        int maxOccurence = 0; // Integer.MIN_VALUE;
        int moreFrequentElement = arr[0];

        // Iterar sobre o array O(N^2) precisa comparar se cada elemento do ‘loop’ inicial é igual a do segundo
        for (int numb : arr) {
            int count = 0;
            for (int check : arr) {
                if (numb == check) {
                    count++;
                }
            }
            //Verificamos se o count é maior que a variavel maxOccurence e
            if (count > maxOccurence) {
                maxOccurence = count;
                moreFrequentElement = numb;
            }
            // caso, sim, atualizamos está variavel com count e atualizamos a variavel com max frequence com o index
        }
        return moreFrequentElement;
    }

    private static int findLessFrequentElementInArray(int[] arr) {
        // verificar se o array é nulo ou vazio
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        int minOccurence = arr[0]; //
        int lessFrequentElement = arr[0];

        for (int numb : arr) {
            int count = 0;
            for (int check : arr) {
                if (numb == check) {
                    count++;
                }
            }
            //Verificamos se o count é maior que a variavel maxOccurence e
            if (count < minOccurence) {
                minOccurence = count;
                lessFrequentElement = numb;
            }

        }
        return lessFrequentElement;
    }

    private static int[] findLessAndMoreFrequentElementsInArray(int[] arr) {
        // verificar se o array é nulo ou vazio
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        int minOccurence = arr[0]; //
        int maxOccurence = 0; //
        int lessFrequentElement = arr[0];
        int moreFrequentElement = arr[0];

        for (int numb : arr) {
            int count = 0;
            for (int check : arr) {
                if (numb == check) {
                    count++;
                }
            }
            //Verificamos se o count é maior que a variavel maxOccurence e
            if (count < minOccurence) {
                minOccurence = count;
                lessFrequentElement = numb;
            } else if (count > maxOccurence) {
                maxOccurence = count;
                moreFrequentElement = numb;

            }

        }
        return new int[]{lessFrequentElement, moreFrequentElement};
    }

    private static Map<Character, Integer> countOccurenceNumberOfEachString(String str) {
        // verificar se o array é nulo ou vazio
        if (str == null || str.length() == 0) {
            Collections.emptyMap();
        }
        Map<Character, Integer> integerMap = new HashMap<>();
        int count = 0;
        for (char move : str.toCharArray()) {
            // se o numero já estiver no map incrementa a sua contagem
            if (integerMap.containsKey(move)) {
                integerMap.put(move, integerMap.get(move) + 1);
            } else {
                // se não tiver coloca com contagem a 1
                integerMap.put(move, 1);
            }
        }

        return integerMap;
    }

    private static int findLessFrequentElementInArrayMap(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Contar as ocorrências de cada elemento
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int lessFrequentElement = arr[0];
        int minOccurrence = frequencyMap.get(lessFrequentElement);

        // Encontrar o elemento menos frequente
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < minOccurrence) {
                minOccurrence = entry.getValue();
                lessFrequentElement = entry.getKey();
            }
        }

        return lessFrequentElement;
    }

    private static int[] removeDuplicateElementInArrayStreams(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        return Arrays.stream(arr)
                .distinct()
                .toArray();

    }

    private static int[] removeDuplicateElementInUsandoColection(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        //Manter a ordem
        Set<Integer> integers = new LinkedHashSet<>();
        for (int number : arr) {
            integers.add(number);
        }

        int[] result = new int[integers.size()];
        int count = 0;
        for (int index : integers) {
            result[count++] = index;
        }
        return result;
    }

    private static boolean isArrayPalindrome(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        int[] newArray = new int[arr.length];
        int index = arr.length - 1;
        // primeiro reverter o array
        for (int numb : arr) {
            newArray[index] = numb;
            index--;

        }
        return Arrays.equals(newArray, arr);

    }

    private static int[] isArrayReveresed(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        int[] newArray = new int[arr.length];
        int index = newArray.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[index - i] = arr[i];
        }

        return newArray;

    }

    private static int[] invertArrayUsingForEach(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        int[] newArray = new int[arr.length];
        int index = arr.length - 1; // Começa do final do novo array

        // Usando for-each para preencher o novo array em ordem inversa
        for (int number : arr) {
            newArray[index] = number; // Atribui o número na posição atual
            index--; // Decrementa o índice para a próxima posição
        }

        return newArray;
    }

    private static int[] reversedArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("array cannot be null or zero");
        }
        return Arrays.stream(arr) // cria um stream partir do array
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static void readFiles(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha); // Imprime cada linha do ficheiro
            }
        } catch (IOException e) {
            e.printStackTrace(); // Trata exceções de entrada/saída
        }
    }

}