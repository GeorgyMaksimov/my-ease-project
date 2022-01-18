package my.ease.project.lesson.arrays;

import static java.lang.Math.round;

public class ArrayNew {
    public static void main(String[] args) {
        int[] array = new int[50];
        System.out.print("Массив 1");
        int arrayElement;
        for (arrayElement = 0; arrayElement < array.length; arrayElement++) {
            long i = round(100 * Math.random());
            array[arrayElement] = (int) i;
            System.out.print(" " + array[arrayElement]);
            int RemainderOfTheDivision = arrayElement % 3;
            if (RemainderOfTheDivision == 0) {
                array[arrayElement] = 0;
            }
        }
        System.out.println();
        System.out.print("Массив 2: "+array);
        }
    }

