import java.util.Scanner;
class FourProject {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z = 0;
        int i = 0;
        for(i;i<100; i++)
        {
            z = x + y;
            x = z + y;
            y = z + x;
        }


    }
}
