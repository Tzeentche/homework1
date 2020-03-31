package task28;

//      Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//      Найти самую высокую оценку с использованием итератора.

import java.util.*;

public class UsersInput {

    Scanner scn = new Scanner(System.in);
    int size = 0;

    int listCreator() {
        System.out.println("Please, enter your students Integer value, more than 0: ");

        try {
            size = scn.nextInt();
            if(size <= 0) {
                System.out.println("Your group size is too small.");
                System.exit(0);
            }

        } catch(InputMismatchException ex) {
            System.out.println("You entered wrong value. Please, next time be more carefully, enter Integer value, more than 0.");
            System.exit(0);
        }
        return size;
    }
}
