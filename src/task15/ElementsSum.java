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
        int container = 0, max = 0, min = 0, boofer = 0;
        int[] elementsArray = usersInput();

        for (int i = 0; i < elementsArray.length; i++) {
            if (min >= elementsArray[i]) {
                min = elementsArray[i];
                boofer = i;
            }
        }
        min = boofer;
        boofer = 0;

        System.out.println("min " + min);

            for (int j = 0; j < elementsArray.length; j++) {
                if(max <= elementsArray[j]) {
                    max = elementsArray[j];
                    boofer = j;
                }
            }
            max = boofer;

        System.out.println("max " + max);

            if(min > max) {
                boofer = max;
                max = min;
                min = boofer;
            }

            for (int counter = min + 1; counter < max; counter++) {
                container += elementsArray[counter];
            }
        System.out.println("container " + container);
        return container;
    }

    int[] usersInput() {
        int size = 0;

        try{
            Scanner scn = new Scanner(System.in);
            System.out.println("Please, enter integer size of array:");
            size = scn.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("Please, next time enter correct value!");
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
