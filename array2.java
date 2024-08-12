public class array2 {
    public static void main(String args[]) {
        int[] arr = { 1, 4, 5, 7, 8, 2, 3 };
        int targetval = 6;

        findpair(arr, targetval);
    }

    public static void findpair(int[] arr, int targetval) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetval) {
                    System.out.printf("( " + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
