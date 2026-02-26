package fundamentals.methods;

public class ReplaceDemo {

    public static void main(String[] args) {

        //replace() - returns a new string with the given characters replaced
        String password = "123aba";
        String newpassword = password.replace('a', '@'); //will replace all matching characters

        System.out.println(newpassword);


        //replaceFirst() - return a new string with the first match of the expression passed
        String source  = "one two three two";
        String replacement = source.replaceFirst("two", "five");

        System.out.println(replacement);


        //replaceAll() - returns a new string with all matches of the expression passed
        String admin = "two six seven six ten seven";
        String newAdmin = admin.replaceAll("six", "eleven");

        System.out.println(newAdmin);
    }
}
