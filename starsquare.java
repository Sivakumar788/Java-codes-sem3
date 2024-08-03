import java.util.Scanner;

public class starsquare {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.printf("*");
                }
            } else {
                System.out.printf("*");
                for (int j = 1; j < size - 1; j++) {
                    System.out.printf(" ");
                }
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
