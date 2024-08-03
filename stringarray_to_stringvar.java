public class stringarray_to_stringvar {
    public static void main(String[] args) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);
    }
}