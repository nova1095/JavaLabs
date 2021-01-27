package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  Напишите программу, в которой пользователь вводит число, а программой
отображается последовательность из четырех чисел: число, на единицу
меньше введённого, введенное число и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
        */

public class Task1_9 {
    public static void main(String[] args) {
        Scanner input_number = new Scanner(System. in);
        System. out. println("Введите число" );
        Integer[] array_value = getResultDecision(input_number. nextInt());
        System. out. print("Результат: ");
        for (Integer val: array_value) {
            System. out. print(val + " ");
        }
    }
    private static Integer[] getResultDecision(Integer value) {
        Integer summer = 0;
        Integer[] array_result = new Integer[]{ value - 1, value, value + 1, 0};
        for (int i = 0; i < array_result. length - 1; i++){
            summer += array_result[i];
        }
        array_result[array_result. length - 1] = (int) Math. pow(summer, 2);
        return array_result;
    }
}
