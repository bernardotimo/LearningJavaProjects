package methods;

public class ConvertingDemo {

    public static void main(String[] args) {

        //converting number to string
        String intStr = String.valueOf(10);
        System.out.println("intStr = " + intStr);

        String flStr = String.valueOf(9.99);
        System.out.println("flStr = " + flStr);

        //converting to uppercase and lowercase
        String newString = "Mix of LowerCase ANd UpperCASe";
        String uppercase = newString.toUpperCase();
        String lowercase = newString.toLowerCase();

        System.out.println(uppercase);
        System.out.println(lowercase);
    }
}
