package task3;

//      Создайте число. Определите, является ли последняя цифра числа семеркой.

import java.util.*;

public class LastNumber {

    private static Scanner scn;

    public static void main(String[] args) {

        int number = 0;

        System.out.println("Please, enter your INTEGER number: ");

        try {

            while(true) {
                if(scn == null) {
                    scn = new Scanner(System.in);

                } else if(scn.hasNextInt()) {

                    System.out.println(" d ");
                }
                number = scn.nextInt();
                break;
            }

            if (number % 10 == 7 | number % 10 == -7) {

                System.out.println("Your number's last numeral is 7!");
            } else {

                System.out.println("Your number's last numeral is not 7...");

                scn.close();
            }

        } catch (InputMismatchException e) {

            System.out.println("Please, try again and enter NUMERAL value.");
        }
    }
}
