package moviepage;

public class Main {
    public static void main (String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun - Maverick");

        int releaseYear = 2022;
        System.out.println("Release year: " + releaseYear);

        boolean planIncluded = true;

        double criticRating = 8.1;

        double publicRating = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(String.format("Public rating: %.2f stars", publicRating));

        String synopsis;
        synopsis = """
                An adventure movie... 
                Starring Tom Cruise!
                """;
        System.out.println(synopsis);

    }
}
