public class sb_capacity {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        sb.append("string");
        System.out.println(sb.capacity());
    }

}
