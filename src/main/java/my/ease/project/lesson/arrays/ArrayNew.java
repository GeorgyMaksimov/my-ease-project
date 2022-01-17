package my.ease.project.lesson.arrays;

import static java.lang.Math.round;

public class ArrayNew {
    public static void main(String[] args) {
        int[] Array = new int[50];
        System.out.print("Массив");
        for (int i = 0; i < Array.length ; i++) {
            long ArrayElement = round(100 * Math.random());
            Array[i] = ArrayElement;
            System.out.print(" " + Array[i]);
        }

    }
}
