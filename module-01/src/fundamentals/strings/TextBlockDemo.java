package fundamentals.strings;

public class TextBlockDemo {
    public static void main (String[] args) {

        //Text blocks
        String textblock = """
                This is a text inside
                a text block
                """;
        System.out.println(textblock);

        System.out.println();

        //Text block indentation
        String textblock1 = """
                This is a Java text block
                """;
        String textblock2 = """
                This is a Java text block
               """;
        String textblock3 = """
                This is a Java text block
              """;

        System.out.println(textblock1);
        System.out.println(textblock2);
        System.out.println(textblock3);

        //strip indentation
        String input = "   Hey \n This \n Is \n Indented";
        String output = input.stripIndent().trim();

        System.out.println(output);

        //translate escape codes
        String source = "Hey, \\n This is not normally a line break.";
        System.out.println(source);

        String result = source.translateEscapes();
        System.out.println(result);
    }
}
