package my.ease.project.lesson.collections;

import my.ease.project.lesson.arrays.ArrayHelper;

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
        int[] array=new int[50];
        ArrayHelper.fill(array);
    }
}
