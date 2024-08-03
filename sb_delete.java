import java.util.Scanner;

public class sb_delete {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("Hello ");
        sb.delete(1, 3);
        System.out.println(sb);
    }

}