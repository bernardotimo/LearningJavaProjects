package fundamentals.variables;

public class VariablesDemo {

    public static void main(String[] args){

        //A variable is a container that stores a value so the program can use later

        //Integer
        int age = 22;

        //Decimal number
        double height = 1.75;

        //Boolean (True or False)
        boolean isLoggedIn = true;

        //Text
        String coding = "Java";

        //Single character
        char initial = 'B';

        //Byte -128 to 127
        byte num = 5;

        //Short -32768 to 32767
        short sqFeet = 3240;

        //Long -2^63 to 2^63
        long nationalDebt = 3485687456845L;

        System.out.println("Age: " + age);
        System.out.println("Heigh: " + height);
        System.out.println("Is user logged in? " + isLoggedIn);
        System.out.println("What are you coding? " + coding);
        System.out.println("Initial: " + initial);
    }
}
