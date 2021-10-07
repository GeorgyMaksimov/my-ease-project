package my.ease.project.lesson.arrays;

import java.util.Scanner;

/**
 * @author Maksimov
 */
public class PrimeNumbers {

    /**
     * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
     * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
     * @param args main arg
     *
     */
    public static void main(String[] args) {
        int y = 0;
        for (int x=0;x<100;x=x+1){
            y++;
            int i= y%y;
            if (i!=0){
                System.out.print(""+y);
            }
        }
    }
}
