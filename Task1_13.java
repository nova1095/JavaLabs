package com.company;
import java.util.Scanner;

//Сделайте вариант вычисление a^b с помощью встроенного метода (искать в Math)

public class Task1_13 {
    public static void main(String[] args) {
        Scanner input_value = new Scanner(System. in);

        System. out. print("Введите число а: ");
        Integer first_value = input_value. nextInt();

        System. out. print("В степени b: ");
        Integer second_value = input_value. nextInt();

        isPow(first_value, second_value);
    }

    private static void isPow(Integer value1, Integer value2) {
        System. out. println("Результат встроенного метода (возведение в степень a^b): "  + (int) Math. pow(value1, value2));
    }
    }
