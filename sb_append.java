import java.util.Scanner;

public class sb_append {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("java");
        System.out.println(sb);
    }
}
