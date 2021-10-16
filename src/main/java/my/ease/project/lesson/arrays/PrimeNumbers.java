package my.ease.project.lesson.arrays;

import java.util.*;

/**
 * @author Maksimov
 */
public class PrimeNumbers {

    /**
     * Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
     * Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
     *
     * @param args main arg
     */
    public static void main(String[] args) {
        printSimpleNumber1();
        System.out.println("hello");
        printSimpleNumber2();
    }

    private static void printSimpleNumber2() {
        for (int number=2;number<201;number++){
           int remainder=0;
            for (int divider=1;divider<=number;divider++){
                if (number%divider==0) {
                    remainder++;
                }
            }
            if (remainder==2){
                System.out.print(" "+number);
            }
        }
    }

    private static void printSimpleNumber1() {
        Set<Integer> dividers =new HashSet<>();
        dividers.add(1);
       //dividers.add(2);
        // dividers.add(3);
        for (int x = 2; x < 201; x++) {
            int remainer=0;
            int lastDivider=0;
            for (Integer divider:dividers) {
                if (x % divider == 0) {
                    remainer++;
                    lastDivider=divider;
                }
            }
            if (lastDivider<x){
                remainer++;
            }
            if (remainer==2){
                System.out.print(x+" ");
                dividers.add(x);
            }
        }
    }
}


