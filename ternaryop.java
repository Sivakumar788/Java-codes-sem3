public class ternaryop {
    public static void main(String[] args) {
        int x, y;
        x = 20;
        y = (x == 1) ? 61 : 90;
        System.out.println("value of y is: " + y);
        y = (x == 20) ? 61 : 90;
        System.out.println("value of y is: " + y);
    }
}