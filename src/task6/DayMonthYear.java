package task6;

//      Имеются три числа - день, месяц, год. Вывести в виде трех чисел дату следующего дня.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayMonthYear {

    public static void main(String[] args) {

        int[] days = new int[3];
        String[] names = {"DD", "MM", "YY"};

        Scanner scan = new Scanner(System.in);

        try {

            for (int i = 0; i < days.length; i++) {
                System.out.println("Please, enter day, month and year at format " + names[i]);
                days[i] = scan.nextInt();
            }
            scan.close();

        } catch(InputMismatchException ex) {

            System.out.println("You did something wrong. Try again!");
        }
    }

    static int userInput(int[] date) {



        return 0;
    }
}
