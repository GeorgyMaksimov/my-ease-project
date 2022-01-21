package my.ease.project.lesson.arrays;

import static java.lang.Math.round;

public class NewArray {
    // где условия задачи?
    public static void main(String[] args) {
        int[] array = new int[50];
        //зачем тут обявлен arrayElement?
        //используй ArrayHelper для запрления зачем дублировать код?
        int arrayElement;
        for (arrayElement = 0; arrayElement < array.length; arrayElement++) {
            long i = round(100 * Math.random());
            array[arrayElement] = (int) i;
            System.out.print(" " + array[arrayElement]);
        }
        System.out.println();

        for (int index = 0; index < array.length; index++) {
            var element = array[index];
            int remainderOfTheDivision = element % 3;
            if (remainderOfTheDivision == 0) {
                element = 0;
                // System можно вынести за условия зачем он тут?
                System.out.print(" " + element);
            } else {
                System.out.print(" " + element);
            }
        }
    }
}