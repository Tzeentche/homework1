package task10;

//      Имеется целое число. Следует посчитать сумму цифр данного числа.

import java.util.*;

public class HasInteger {

    public static void main(String[] args) {

        int numberIs, counter = 0;
        Scanner scn = new Scanner(System.in);

        try {

            System.out.println("Please, enter Integer number, more than 1:");
            numberIs = scn.nextInt();
            scn.close();
            if(numberIs < 2) {
                System.out.println("That is too low...");
                System.exit(0);
            }

            while(numberIs != 0){
                counter += (numberIs % 10);
                numberIs /= 10;
            }

        } catch(InputMismatchException ex) {
            System.out.println("Please, try again and enter only integers!");
        }

        System.out.println("Result is: " + counter);
    }
}
