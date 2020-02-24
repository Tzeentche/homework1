package task3;

//      Создайте число. Определите, является ли последняя цифра числа семеркой.

import java.util.*;

public class LastNumber {

    public static void main(String[] args) {

        int number = 0, boofer = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter your number: ");
            number = input.nextInt();
            input.close();

            boofer = (number % 10);

            if (boofer == 7) {

                System.out.println("Your number's last numeral is 7!");
            } else {

                System.out.println("Your number's last numeral is not 7...");
            }

        } catch (InputMismatchException e) {

            System.out.println("Please, try again and enter NUMERAL value.");
        }
    }
}
