package code.vanilson.oop;

/**
 * Exercicios
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */
public class Exercicios {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 3, 4, 5, 6, 4, 4, 5, 6, 4};
        int[] max = {1, 2, 3, 5, 6, 4, 1234, 234};

        System.out.println("elemento com mais frequencia : " + moreFrequenteElementArray(array));
        System.out.println("segundo  mais frequencia : " + secondMoreFrequentElementArray(array));

        System.out.println("segundo valor maximo : " + secondLargestElementArray(max));

    }

    public static int moreFrequenteElementArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxOccurenceNumber = 0;
        int moreFrequentElement = 0;

        for (int index : array) {
            int count = 0;

            for (int posix : array) {
                if (index == posix) {
                    count++;
                }
            }

            if (count > maxOccurenceNumber) {
                maxOccurenceNumber = count;
                moreFrequentElement = index;
            }

        }
        return moreFrequentElement;
    }

    public static int secondMoreFrequentElementArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Retorna 0 se o array for nulo ou vazio
        }

        int maxOccurrenceNumber = 0;
        int moreFrequentElement = 0;
        int secondMoreFrequentElement = 0;
        int secondMaxOccurrenceNumber = 0;

        for (int index : array) {
            int count = 0;

            // Contar a frequência do elemento atual
            for (int posix : array) {
                if (index == posix) {
                    count++;
                }
            }

            // Atualizar o elemento mais frequente
            if (count > maxOccurrenceNumber) {
                secondMaxOccurrenceNumber = maxOccurrenceNumber;
                secondMoreFrequentElement = moreFrequentElement;

                maxOccurrenceNumber = count;
                moreFrequentElement = index;
            }
            // Atualizar o segundo elemento mais frequente
            else if (count > secondMaxOccurrenceNumber && count < maxOccurrenceNumber) {
                secondMaxOccurrenceNumber = count;
                secondMoreFrequentElement = index;
            }
        }

        // Se o segundo elemento mais frequente não foi atualizado, retorna 0
        return (secondMaxOccurrenceNumber > 0) ? secondMoreFrequentElement : 0;
    }

    public static int secondLargestElementArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Retorna 0 se o array for nulo ou vazio
        }
        int maxValue = 0;
        int secondMaxValue = 0;

        for (int index : array) {
            if (index > maxValue) {
                secondMaxValue = maxValue;
                maxValue = index;
            } else if (index > secondMaxValue && index < maxValue) {
                secondMaxValue = index;

            }

        }
        return secondMaxValue;
    }
}