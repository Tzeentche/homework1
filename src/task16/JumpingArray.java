package task16;

//      Создать массмв, заполнить его случайными элементами, распечатать, перевернуть и снова распечатать
//      (при переворачивании нежелательно создавать ещё один массив)

import java.util.*;

public class JumpingArray {

    public static void main(String[] args) {

        JumpingArray jumpingArray = new JumpingArray();
        jumpingArray.arrayOutput();
    }

    int arrayCreator() {

        int size = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Please, enter arrays size:");
            size = scn.nextInt();

        } catch (InputMismatchException ex) {

            System.out.println("You entered wrong value. Please, next time enter INTEGER.");
        }
        return size;
    }

    int[] arrayFilling() {

        int size = arrayCreator();
        int[] array = new int[size];

        System.out.println("Now filled array is: ");

        for (int i = 0; i < size; i++) {
        array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    StringBuffer arrayReverse() {

        int[] arraysContain = arrayFilling();
        StringBuffer reversedArray = new StringBuffer();

        for(int i = 0; i < arraysContain.length; i++) {
            reversedArray.append(arraysContain[i]);
        }

        reversedArray.reverse();
        return reversedArray;
    }

    int arrayOutput() {

        StringBuffer reversedArray = arrayReverse();
        

        System.out.println("reversedArray is " + reversedArray);
        return 0;
    }
}
