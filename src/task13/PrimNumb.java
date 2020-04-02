package task13;

//        Решить задание на поиск простых чисел с использованием break.

import java.util.*;

public class PrimNumb {

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
                if(boofer >= 3) {
                    break;
                }
            }
        }

        return (boofer < 3) ? true : false;
    }
}
