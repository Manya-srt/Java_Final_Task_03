// Напишите программу конвертер валют.
// Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс Доллара США к Российскому рублю на сегодня: ");
        double rubCourse = scanner.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rubCount = scanner.nextDouble();
        System.out.println("Вы можете купить "+ convert(rubCourse,rubCount)+" $");
    }

    static double convert(double rubCourse, double count){
        return count/rubCourse;
    }
}
