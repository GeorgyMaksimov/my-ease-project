package my.ease.project.lesson.arrays;

import java.util.HashMap;
import java.util.Map;

public class StatArray {
    /**
     * Посчитать какое кол-во повторяющихся элементов в массиве
     *
     * @param args Входные переменные
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        ArrayHelper.fill(array);
        Map<Integer, Integer> itemToCountItem = new HashMap<>();

        for (int element : array) {
            if (itemToCountItem.containsKey(element)) {
                int countItem = itemToCountItem.get(element);
                itemToCountItem.put(element, countItem + 1);
            } else {
                itemToCountItem.put(element, 1);
            }
        }
        for (int item : itemToCountItem.keySet()) {
            if (itemToCountItem.get(item) > 1) {
                System.out.println("Element Array " + item + " Count " + itemToCountItem.get(item));
            }

        }
    }
}
