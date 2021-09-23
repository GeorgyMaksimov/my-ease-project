import java.util.Scanner;

public class SecondProject {


    public static int getMod(int x, int y) {
        return x % y;
    }

    //Где вызов твоего метода s? Вообще, из за того что ты назвал метод s непонятно что это метод, методы принято называть глаголом
    //типа getReminder
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //ты считывание вызываешь в двух местах, зачем? Задание было передать в функцию значение
        int firstValue = reader.nextInt();
        int secondValue = reader.nextInt();
       int z =  getMod(firstValue, secondValue);
        if (firstValue > 99) {
            System.out.print("Error");
        } else {
            if (firstValue < 1) {
                System.out.print("Error");
            } else {
                switch (z) {
                    case (0):
                        System.out.print(firstValue + " " + "Лет");
                        break;
                    case (1):
                        System.out.print(firstValue + " " + "Год");
                        break;
                    case (2):
                        System.out.print(firstValue + " " + "Года");
                        break;
                    case (3):
                        System.out.print(firstValue + " " + "Года");
                        break;
                    case (4):
                        System.out.print(firstValue + " " + "Года");
                        break;
                    case (5):
                        System.out.print(firstValue + " " + "Лет");
                        break;
                    case (6):
                        System.out.print(firstValue + " " + "Лет");
                        break;
                    case (7):
                        System.out.print(firstValue + " " + "Лет");
                        break;
                    case (8):
                        System.out.print(firstValue + " " + "Лет");
                        break;
                    case (9):
                        System.out.print(firstValue + " " + "Лет");
                        break;

                }
            }

        }
    }
}
