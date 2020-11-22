package com.inte;
import java.util.function.IntBinaryOperator;

public class Practice1 {

   public static void main(String args[]) {
        // lambda expression
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}
