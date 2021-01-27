package com.company;
import java.util.Scanner;
/*
Напишите программу, в которой Пользователь вводит два числа, а
программой вычисляется и отображается сумма и разность этих чисел.
*/

public class Task1_10 {
    public static void main(String[] args) {
        Scanner input_value = new Scanner(System. in);

        System. out. print("Введите первое число: ");
        Integer first_value = input_value. nextInt();

        System. out. print("Введите второе число: ");
        Integer second_value = input_value. nextInt();

        System. out. println("Результат сложения (сумма чисел): "  + getResultAddition(first_value, second_value) +  "\n"  +
                "Результат вычитания (разность чисел): " + getResultSubtract(first_value, second_value));
    }

    private static int getResultAddition(Integer value1, Integer value2) {
        return value1 + value2;
    }

    private static int getResultSubtract(Integer value1, Integer value2) {
        return value1 - value2;
    }
}
