package org.example;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int add(String a, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        return num1 + num2;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public double mult(double a, double b){
        return a * b;
    }

    public double mult(String a, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        return num1 * num2;
    }

    public double del(double a, double b){
        return a / b;
    }
}
