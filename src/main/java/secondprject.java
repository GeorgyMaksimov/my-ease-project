import java.util.Scanner;

public class secondprject {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int x = reader.nextInt();
        int y = 10;
        int z = x % y;
        if (x > 99) {
            System.out.print("Error");
        }
        else {
            if (x < 1) {
                System.out.print("Error");
            }
            else {
                switch (z) {
                    case (0):
                        System.out.print(x +" "+"Лет");
                        break;
                    case (1):
                        System.out.print(x +" "+ "Год");
                        break;
                    case (2):
                        System.out.print(x +" "+ "Года");
                        break;
                    case (3):
                        System.out.print(x +" "+ "Года");
                        break;
                    case (4):
                        System.out.print(x +" "+ "Года");
                        break;
                    case (5):
                        System.out.print(x +" "+ "Лет");
                        break;
                    case (6):
                        System.out.print(x +" "+ "Лет");
                        break;
                    case (7):
                        System.out.print(x +" "+ "Лет");
                        break;
                    case (8):
                        System.out.print(x +" "+ "Лет");
                        break;
                    case (9):
                        System.out.print(x +" "+ "Лет");
                        break;

                }
            }

        }
    }
}
