import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, max, lcm;
        System.out.println("Enter number 1");
        a = ob.nextInt();
        System.out.println("Enter number 2");
        b = ob.nextInt();
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max += 1;
        }

        System.out.printf("The LCM is: %d", lcm);
    }
}
