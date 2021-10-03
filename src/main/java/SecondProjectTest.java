import java.util.Scanner;

public class SecondProjectTest {

    public static boolean isTenner(int x) {
        return x >= 10 && x <= 19;
    }

    public static int getMod(int x, int y) {
        return x % y;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstValue = reader.nextInt();
        if (firstValue > 99) {
            throw new RuntimeException("Great ago " + firstValue);
        }
        if (firstValue < 1) {
            throw new RuntimeException("Small ago " + firstValue);
        }
        int secondValue = 10;
        int age = getMod(firstValue, secondValue);
        if (isTenner(firstValue)) {
            System.out.println(firstValue + " Лет");
        } else {
            switch (age) {
                case (1):
                    System.out.print(firstValue + " " + "Год");
                    break;
                case (2):
                case (3):
                case (4):
                    System.out.print(firstValue + " " + "Года");
                    break;
                case (0):
                case (5):
                case (6):
                case (7):
                case (8):
                case (9):
                    System.out.print(firstValue + " " + "Лет");
                    break;

            }
        }
    }
}
