package ru.job4j.calculator;
import  ru.job4j.math.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double subAndDiv(double first, double second) {
        return MathFunction.subtract(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumAll(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                + MathFunction.division(first, second)
                + MathFunction.subtract(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAll(10, 20));
    }
}
