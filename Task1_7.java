import java.util.Calendar;
import java.util.Scanner;

/*
 Напишите программу, в которой по возрасту определяется год рождения.
*/

public class Task1_7 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Сколько Вам лет?");
        Scanner input_value_year = new Scanner(System.in);
        System.out.println("Год рождения пользователя: " + (calendar.get(Calendar.YEAR) - input_value_year.nextInt()));
    }
}
