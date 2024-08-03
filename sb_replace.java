import java.util.Scanner;

public class sb_replace {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello ");
        sb.replace(1, 3, "java");
        System.out.println(sb);
    }

}