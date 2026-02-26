package fundamentals.strings;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class EndcodingBytesDemo {

    public static void main(String[] args) {

        //getting bytes
        String theString = "Code";

        byte[] bytes1 = theString.getBytes();
        byte[] bytes2 = theString.getBytes(StandardCharsets.UTF_8); //modern way

        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(bytes2));
    }
}
