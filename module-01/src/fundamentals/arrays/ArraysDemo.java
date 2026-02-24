package fundamentals.arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        //Array is a collection of values stored as a single variable, and it's length is fixed on creation

        //Defined by []

        //Declare array variable and assign values
        int[] prices = {10, 20, 30, 40};

        //Accessing the first element
        int firstElement = prices[0];

        //Accessing the last element
        int lastElement = prices[3];

        //Changing value
        prices[2] = 95;

        //Strings
        String[] users = {"John", "Ana", "Carl"}; //all values must have the same type

        System.out.println(users); //will not print

        //printing
        String[] names = {"Curie", "Einstein", "Fermi"};

        for (String name : names) {
            System.out.println(name);
        }

    }
}
