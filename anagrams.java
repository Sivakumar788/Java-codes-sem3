import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine();
        String s2 = obj.nextLine();
        char sa1[] = s1.toCharArray();
        char sa2[] = s2.toCharArray();
        char temp;
        for (int i = 0; i < sa1.length; i++) {
            for (int j = i + 1; j < sa1.length; j++) {
                if (sa1[i] > sa1[j]) {
                    temp = sa1[i];
                    sa1[i] = sa1[j];
                    sa1[j] = temp;
                }
                if (sa2[i] > sa2[j]) {
                    temp = sa2[i];
                    sa2[i] = sa2[j];
                    sa2[j] = temp;
                }
            }

        }
        int counter = 0;
        for (int i = 0; i < sa1.length; i++) {
            if (sa1[i] == sa2[i]) {
                counter++;
            }
        }
        if (counter == sa1.length) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

}