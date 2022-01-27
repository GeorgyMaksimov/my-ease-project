package my.ease.project.lesson.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maksimov
 */
public class InitListExample {
    /**
     * Заполните список случайным числами и выведите только те у которых порядковывй номер кранет 2.
     * <p>
     * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
     *
     * @param args main arg
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(100);
        for (int index = 0; index < 100; index++) {
            int newElement = (int) Math.round(100 * Math.random());
            list.add(newElement);
            int remainderOfTheDivision = index % 2;
            if (remainderOfTheDivision == 0){
                System.out.print(" "+newElement);
            }
        }
    }
}
