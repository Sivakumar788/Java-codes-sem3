import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter Second number");
        num2 = scanner.nextDouble();

        System.out.println("Choose an operator: +,-,*,/,%,q-quit");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(result);
                break;
            case 'q':
                break;
        }
    }

}
