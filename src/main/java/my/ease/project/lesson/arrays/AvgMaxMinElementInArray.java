package my.ease.project.lesson.arrays;

/**
 * @author Maksimov
 */
public class AvgMaxMinElementInArray {

    /**
     * Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
     * <p>
     * Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
     *
     * @param args main arg
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        ArrayHelper.fill(array);
        Integer min = null;
        Integer max = null;
        int sum = 0;
        for (int element : array) {
            if (min == null) {
                min = element;
            }
            if (max == null) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
            sum = sum + element;
        }
        int avg = sum / array.length;
        System.out.println("min " + min + " max " + max + " avg " + avg);
    }
}
