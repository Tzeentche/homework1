package task27;

//      Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

import java.util.*;

public class UsersDiallog {

    Scanner scn = new Scanner(System.in);
    int size = 0;

    int collectionSize() {
        System.out.println("Please, enter your collection Integer size, more than 0 : ");

        try{
            size = scn.nextInt();
            scn.close();

            if(size <= 0) {
                System.out.println("Your collection is less, than 0. That's all.");
                System.exit(0);
            }
        } catch(InputMismatchException ex) {
            System.out.println("You entered wrong value. Please, next time be more carefully, and enter Integer value.");
            System.exit(0);

        }
        return size;
    }
}
