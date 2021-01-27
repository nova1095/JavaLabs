package com.company;
import java.util.Scanner;
/*
Напишите программу для вычисления суммы двух чисел. Оба числа
вводятся пользователем. Для вычисления суммы используйте оператор +
*/

public class Task1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Первое число: ");
        int num1 = in.nextInt();

        System.out.print("+ второе число: ");
        int num2 = in.nextInt();

        num1 = num1 + num2;

        in.close();

        System.out.printf("сумма = %d\n", num1);
    }
}
