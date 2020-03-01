package task14;

//      В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

import java.util.*;

public class MaxMark {

    public static void main(String[] args) {

        MaxMark maxMark = new MaxMark();
        maxMark.indexReturn();
    }

    int userInput() {

        int size = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Please, enter integer size of array:");
            size = scn.nextInt();
            scn.close();

        } catch (InputMismatchException ex) {

            System.out.println("Please, enter CORRECT (integer) size of array!");
        }

        return size;
    }

    int[] randomFiling() {

        int size = userInput();
        int[] marks = new int[size];

        for(int counter = 0; counter < size; counter++){
            marks[counter] = (int)(Math.random() * 10);
        }
        return marks;
    }

    int giveMeIndex() {

        int[] marksArray = randomFiling();
        int boofer = 0, index = 0;

        for (int counter = 0; counter < marksArray.length; counter++) {
            if(marksArray[counter] > boofer) {
                boofer = marksArray[counter];
                index = counter + 1;
            }
        }
        return index;
    }

    void indexReturn() {

        System.out.println("Index of max mark is " + giveMeIndex());
    }
}
