import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String line1 = scanner.nextLine();
        char string[] = line1.toCharArray();
        int count;

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = 0;
                }
            }

            if (count > 1 && string[i] != '0') {
                System.out.println(string[i] + "\n");
            }

        }
    }
}