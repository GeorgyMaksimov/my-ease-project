package my.ease.project.lesson.arrays;

import myArray.lenght;

/**
 * @author Maksimov
 */
public class AvgMaxMinElementInArray {
    private static Object lenght;

    /**
     * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
     * <p>
     * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
     *
     * @param args main arg
     */
    public static void main(String[] args) {
        double array = Math.random(0, 1);
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.lengtht; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
    }
