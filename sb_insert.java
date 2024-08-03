import java.util.Scanner;

public class sb_insert {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "java");
        System.out.println(sb);
    }

}
