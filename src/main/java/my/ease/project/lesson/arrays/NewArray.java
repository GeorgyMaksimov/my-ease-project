package my.ease.project.lesson.arrays;

import static java.lang.Math.multiplyFull;
import static java.lang.Math.round;

public class NewArray {
    /**
     1. Создайте массив из 50 случайных целых чисел
     2. Выведите массив на экран в строку
     3. Замените каждый элемент с  индексом кратный 3  на ноль
     4. Снова выведете массив на экран на отдельной строке
           */
    
    public static void main(String[] args) {
        int[] array=new int[50];
        ArrayHelper.fill(array);
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