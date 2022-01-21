package my.ease.project.lesson.arrays;

/**
 * @author Maksimov
 */
public class ArrayHelper {

    /**
     * Вспомогающий метод заполняет массив случайными числами
     * @param array массив
     */
    public static void fill(int[] array) {
        for (int index = 0; index < array.length; index++) {
            int newElement = (int) Math.round(100 * Math.random());
            System.out.print(newElement + " ");
            array[index] = newElement;
        }
        System.out.println();
    }
}
