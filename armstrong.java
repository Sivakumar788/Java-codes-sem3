import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int num1;
        num1 = myobj.nextInt();
        int temp = num1;
        int[] digits = new int[20];
        double sum = 0;
        int i = 0;
        while (temp != 0) {
            digits[i] = temp % 10;
            temp = temp / 10;
            i++;
        }
        int length = i;
        for (i = 0; i < length; i++) {
            sum = sum + (Math.pow(digits[i], length));
        }
        if (num1 == sum) {
            System.out.printf("The number is an amstrong number");
        } else {
            System.out.printf("The number is not an amstrong number");
        }
        myobj.close();
    }
}
