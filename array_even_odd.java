public class array_even_odd {
    public static void main(String args[]) {
        int[] newarr = { 1, 4, 2, 3, 6, 8, 5, 9 };
        for (int i = 0; i < newarr.length; i++) {
            if (newarr[i] % 2 != 0) {
                System.out.println(newarr[i]);
            }
        }
    }
}
