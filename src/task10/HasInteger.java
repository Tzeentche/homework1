package task10;

//      Имеется целове число. Следует посчитать сумму цифр данного числа.

import java.util.*;

public class HasInteger {

    public static void main(String[] args) {

        int numberIs, counter = 0;
        Scanner scn = new Scanner(System.in);

        try {

            System.out.println("Please, enter integer number:");
            numberIs = scn.nextInt();
            scn.close();

            if(numberIs < 100) {

                counter = (numberIs % 10) + (numberIs / 10);

            } else if (numberIs < 1000) {

                counter += (numberIs % 10) + ((numberIs % 100) / 10) + (numberIs / 100);

            } else if (numberIs < 10000) {

                counter += (numberIs % 10) + ((numberIs % 100) / 10) + ((numberIs % 1000) / 100) + (numberIs / 1000);

            } else if (numberIs > 10000) {

                System.out.println("That's enough!");
                System.exit(0);
            }

        } catch(InputMismatchException ex) {

            System.out.println("Please, try again and enter only integers!");
        }

        System.out.println("Result is " + counter);
    }
}
