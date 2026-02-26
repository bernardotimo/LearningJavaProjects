package fundamentals.casting;

public class PrimitiveDemo {

    public static void main(String[] args) {

        //Implicit (widening) casting (automatic)
        //Small -> bigger type

        int a = 10;
        double b = a;

        System.out.println(b); //safe and automatic

        //Explicit (narrowing) casting (manual)
        //Big -> smaller type

        double x = 9.8;
        int y = (int) x; //manual

        System.out.println(y); //decimal part is lost - you control the risk
    }
}
