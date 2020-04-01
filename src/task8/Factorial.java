package task8;

//      Изменить пример с суммой числе таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.

import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Factorial result = new Factorial();
        int usersValueIs = result.usersInput();
        System.out.println(result.counter(usersValueIs));
    }

    int usersInput() {

        int fact = 0;
        Scanner scn = new Scanner(System.in);

        try {

            System.out.println("Please, enter your value, less than \"25\", because overloading:");
            fact = scn.nextInt();
            scn.close();
            if(fact > 25) {
                System.out.println("It's too much! Please, next time enter less value.");
                System.exit(0);
            }

        } catch(InputMismatchException ex) {

            System.out.println("You entered wrong value. Next time be more carefully and always be happy!");
        }
        return fact;
    }

    long counter(int value) {
        long factorial = 1;

        for (int i = 1; i <= value; i++) {
            factorial = (long)(factorial * i);
        }
        return factorial;
    }
}
