package code.vanilson.data_structure.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * SortElementInAscendingOrder
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-03-01
 */
public class SortElementInAscendingOrder {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        sortArrayListInAlphabeticInAscendingOrder(cars);
        System.out.println("Sorted cars in ascending order:" + cars);

    }

    public static void sortArrayListInAlphabeticInAscendingOrder(List<String> list) {
        if (list == null) {
            return;
        }
        Collections.sort(list);
    }


}