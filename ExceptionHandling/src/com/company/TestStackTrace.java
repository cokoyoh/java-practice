package com.company;

public class TestStackTrace {
    TestStackTrace()
    {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            System.out.println("Problem performing the operation: " + exception.getMessage());
        }
    }

    int divideByZero() throws ArithmeticException
    {
        return  25 / 0;
    }

    public static void main(String[] args) {
        new TestStackTrace();
    }
}
