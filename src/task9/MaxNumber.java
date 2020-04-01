package task9;

//      Как в примере, имеется последовательность случайных чисел, найти и вывести наибольшее из них.

import java.util.*;

public class MaxNumber {

    public static void main(String[] args) {

        MaxNumber result = new MaxNumber();
        int usersSequence = result.usersInput();
        System.out.println("Max value is: " + result.counter(usersSequence));
    }

    int usersInput() {

        int size = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Please, enter Integer size of your sequence, more than 1: ");
            size = scn.nextInt();
            scn.close();
            if(size < 2) {
                System.out.println("It's too low! Please, next time enter less value.");
                System.exit(0);
            }

        } catch(InputMismatchException ex) {
            System.out.println("You entered wrong value. Next time be more carefully, enter any Integer value, more than 1 (and always be happy!)");
        }

        return size;
    }

    int counter(int size) {
        int[] array = new int[size];
        int max = 0;

        System.out.print("Our numbers sequence is: ");
            for (int i = 0; i < size; i++) {
                array[i] = (int)(Math.random() * 15 + 1);
                System.out.print(" " + array[i]);
            }
        System.out.println();

            for(int j = 0; j < size; j++) {
                if(array[j] > max) {
                    max = array[j];
                }
            }
        return max;
    }
}
