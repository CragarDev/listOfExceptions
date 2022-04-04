import java.util.ArrayList;

public class listOfExceptions {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("====== Starting listOfExceptions main ======");
        System.out.println("");
        System.out.println("--- listOfExceptions main ---");
        System.out.println("");

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        try {
            for (int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Caught an error of\n:::::ERROR::::::\n" + e + "\n::::::::::::::::");
        }

        System.out.println("");
        System.out.println("====== End of listOfExceptions main ======");
        System.out.println("");
    }
}