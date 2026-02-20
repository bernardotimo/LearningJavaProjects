package fundamentals;

import fundamentals.operators.ArithmeticDemo;
import fundamentals.operators.AssignmentDemo;
import fundamentals.operators.BitWiseDemo;
import fundamentals.operators.InstanceofDemo;
import fundamentals.operators.LogicalDemo;
import fundamentals.operators.PrecedenceDemo;
import fundamentals.operators.RelationalDemo;
import fundamentals.operators.TernaryDemo;
import fundamentals.operators.UnaryDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== JAVA FUNDAMENTALS LAB ===");

        System.out.println("Arithmetic: ");
        ArithmeticDemo.run();

        System.out.println("Assignment: ");
        AssignmentDemo.run();

        System.out.println("BitWise: ");
        BitWiseDemo.run();

        System.out.println("Instanceof: ");
        InstanceofDemo.run();

        System.out.println("Logical: ");
        LogicalDemo.run();

        System.out.println("Precedence: ");
        PrecedenceDemo.run();

        System.out.println("Relational: ");
        RelationalDemo.run();

        System.out.println("Ternary: ");
        TernaryDemo.run();

        System.out.println("Unary: ");
        UnaryDemo.run();

    }
}