package com.company;

// Используйте новый метод для расчета гипотенузы. Сделайте вариант метода hyp() с параметрами.

public class Task1_12 {
    public static void main(String[] args) {
        System.out.println("a = 10.0, b = 4.0");
        double a = 10.0, b = 4.0;
        System.out.println("Гипотенуза: " + hyp(a, b));
    }

    private static double hyp(double cath1, double cath2) {
        return Math.sqrt(customDegree(cath1, 2) + customDegree(cath2, 2));
//        return Math.sqrt(standartDegree(cath1, 2) + standartDegree(cath2, 2));
    }

    private static double customDegree(double x, double y) {
        return Math.exp(y * Math.log(x));
    }

    private static double standartDegree(double x, double y) {
        return Math.pow(x, y);
    }
}
