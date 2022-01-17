package my.ease.project.lesson.arrays;

import static java.lang.Math.round;

public class ArrayNew {
    public static void main(String[] args) {
        int[] array = new int[50];
        array = Math.round(100 * Math.random());
        System.out.print("Массив: " + array);
    }
}
