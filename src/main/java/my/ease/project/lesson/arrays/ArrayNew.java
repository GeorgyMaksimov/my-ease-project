package my.ease.project.lesson.arrays;

import static java.lang.Math.round;

public class ArrayNew {
    public static void main(String[] args) {
        int[] array = new int[50];
        System.out.print("Массив");
        for (int i = 0; i < array.length; i++) {
            long arrayElement = round(100 * Math.random());
            array[i] = (int) arrayElement;
            System.out.print(" " + array[i]);
        }

    }
}
