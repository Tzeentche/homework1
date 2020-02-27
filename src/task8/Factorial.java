package task8;

//      Изменить пример с суммой числе таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.

import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Factorial result = new Factorial();
        System.out.println(result.counter());
    }

    int usersInput() {

        int fact = 0;
        Scanner scn = new Scanner(System.in);

        try {

            System.out.println("Please, enter your value:");
            fact = scn.nextInt();
            scn.close();

        } catch(InputMismatchException ex) {

            System.out.println("You entered wrong value. Next time be more carefully and always be happy!");
        }

        return fact;
    }

    int counter() {

        int factorial = 1;
        int value = usersInput();

        for (int i = 1; i <= value; i++) {

            factorial *= i;
        }

        return factorial;
    }
}
