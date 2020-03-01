package task15;

//      Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.

import java.util.*;

public class ElementsSum {

    public static void main(String[] args) {

        ElementsSum elementsSum = new ElementsSum();
        elementsSum.giveMeSumm();
    }

    void giveMeSumm() {

        System.out.println("Summ of array's elements is " + summContainer());
    }

    int summContainer() {

        int container = 0, max = 0, min = 0;
        int[] elementsArray = usersInput();

        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Now please, enter integer MIN summ index:");
            min = scn.nextInt();

            System.out.println("Now please, enter integer MAX summ index:");
            max = scn.nextInt();
            scn.close();

        } catch (InputMismatchException ex) {

            System.out.println("Please< next time enter correct value!");
        }

        for (int i = min - 1; i < max; i++) {
            container += elementsArray[i];
        }
        return container;
    }

    int[] usersInput() {

        int size = 0;

        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, enter integer size of array:");
            size = scn.nextInt();

        } catch (InputMismatchException ex) {

            System.out.println("Please< next time enter correct value!");
        }

        int[] array = arrayFilling(size);
        return array;
    }

    int[] arrayFilling(int size) {

        int[] fullArray = new int[size];

        System.out.println("Now your array looks like this: ");
        for(int i = 0; i < size; i++) {

            fullArray[i] = (int)(Math.random() * 10);
            System.out.print(fullArray[i] + " ");
        }
        System.out.println("...and contains " + size + " elements.");

        return fullArray;
    }
}
