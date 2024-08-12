class Clone {
    public static void main(String[] args) {
        int IntArray[][] = { { 1, 2, 3 }, { 4, 5 } };
        int cloneArray[][] = IntArray.clone();

        System.out.println(IntArray == cloneArray);
        System.out.println(IntArray[0] == cloneArray[0]);
        System.out.println(IntArray[1] == cloneArray[1]);
    }
}
