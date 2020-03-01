package task11;

//      Имеется целое число, определить, является ли это число простым, т.е. делится без остатка только на 1 и себя

import java.util.*;

public class SimpleNum {

    static int container = 1;

    public static void main(String[] args) {

        userInput();

        if(revisor()) {
            System.out.println("Congratulations! Your entered number " + container + " is Prime!");
        } else {
            System.out.println("Unfortunately, this number isn't Prime.");
        }
    }

    static int userInput() {

        try {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, enter your number:");
            container = scn.nextInt();
            scn.close();

        } catch (InputMismatchException ex) {
            System.out.println("What do you think about? Enter Integer value, please!");
        }
        return container;
    }

    static boolean revisor() {

        int boofer = 0;
        for (int i = 1; i <= container; i++) {

            if ((container % i) == 0) {
                boofer++;
            }
        }

        return (boofer < 3) ? true : false;
    }
}
