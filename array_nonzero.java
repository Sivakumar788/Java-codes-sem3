import java.util.Scanner;

public class array_nonzero {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of elements in array: ");
        int n = scanner.nextInt();
        System.out.println("enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                x++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d", arr[i]);
        }
    }
}
