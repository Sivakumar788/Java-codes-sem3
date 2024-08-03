public class finalvar {
    public static void main(String[] args) {
        final int mynum = 15; // making varibale as a final variable type
        mynum = 20; // trying to update final variable type
        int num = 20;
        System.out.println(mynum + num); // mynum will not be updated, will still be 15
    }

}