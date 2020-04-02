package task14;

//      В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

import com.sun.security.jgss.GSSUtil;

import javax.swing.plaf.IconUIResource;
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

        System.out.println("Array with random values looks like next type:");
        for(int counter = 0; counter < size; counter++){
            marks[counter] = (int)(Math.random() * 10);
            System.out.print(marks[counter] + " ");
        }
        System.out.println();
        return marks;
    }

    String giveMeIndex() {

        int[] marksArray = randomFiling();
        String index = new String();
        int boofer = 0;

        for (int counter = 0; counter < marksArray.length; counter++) {
            if(marksArray[counter] >= boofer) {
                boofer = marksArray[counter];
            }
        }

        for(int counter2 = 0; counter2 < marksArray.length; counter2++) {
            if(marksArray[counter2] >= boofer) {
                index += (counter2 + 1) + "; ";
            }
        }
        return index;
    }

    void indexReturn() {

        System.out.println("Index of max mark is " + giveMeIndex());
    }
}
