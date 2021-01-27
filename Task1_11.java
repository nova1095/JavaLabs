package com.company;

/*
Добавьте в пример расчета гипотенузы (см. раздел 2) метод, вычисляющий a^b.
Используйте для этого функции расчета натурального логарифма и
экспоненты (y=exp(b*log(a));
*/

public class Task1_11 {
    static double  a = 9.0, b = 5.0, c;
    public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
}
    public static void main(String[] args) {
        System.out.println("katet a = " + a + "\n" +
                "katet b = " + b + "\n" +
                "hypotenuse c = " + hyp());
    }
}
