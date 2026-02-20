package fundamentals.operators;

public class BitWiseDemo {

    public static void run() {

        //Work at the binary level

        //Bitwise AND
        int a = 5; //0101
        int b = 3; //0001

        int result = a & b; //0001 = 1
        System.out.println(result);

        //Bitwise OR
        int result2 = a | b; // 0111 = 7
        System.out.println(result2);

        //Bitwise XOR
        int result3 = a ^ b; //0110 = 6
        System.out.println(result3);

        //Bitwise NOT
        int x = 5; // 00000000 00000000 00000000 00000101
        int result4 = ~x;

        System.out.println(result4);

        //Left shift
        int y = 5; // 0101
        int result5 = y << 1; //1010 = 10

        System.out.println(result5); //Each shift left multiply by 2

        //Right shift
        int z = 10; // 1010
        int result6 = z >> 1; //0101

        System.out.println(result6); //Each shift right divide by 2

        //Unsigned right shift
        int c = -8;
        int result7 = c >>> 1;

        System.out.println(result7); //Fills left bits with 0 (ignores signs)

        //Example
        final int READ = 1; //0001
        final int WRITE = 2; //0010
        final int EXEC = 4; //0100

        int permissions = READ | WRITE; //0011

        boolean canWrite = (permissions & WRITE) != 0;
        System.out.println("Can write?" + canWrite);

    }
}
