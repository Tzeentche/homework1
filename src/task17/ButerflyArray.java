package task17;

//      Создать двумерный квадратный массив, и заполнить его "бабочкой"
//      1 1 1 1 1
//      0 1 1 1 0
//      0 0 1 0 0
//      0 1 1 1 0
//      1 1 1 1 1

import java.util.InputMismatchException;
import java.util.Scanner;

public class ButerflyArray {

    public static void main(String[] args) {

        ButerflyArray buterflyArray = new ButerflyArray();
        int midResult = buterflyArray.userInput();
        int[][] butterArray = buterflyArray.arrayBuilder(midResult);
        buterflyArray.resultIs(butterArray);
    }

    int userInput() {

        int size = 0;
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Please, enter size of array:");
            size = scn.nextInt();

        } catch (InputMismatchException ex) {

            System.out.println("You entered wrong value. Please, try again!");
        }
        return size;
    }

    int[][] arrayBuilder(int incoming) {

        int[][] arrayUnderConstruct = new int[incoming][incoming];

        for (int firstCounter = 0; firstCounter < incoming; firstCounter ++) {
            for (int secondCounter = 0; secondCounter < incoming; secondCounter++) {

                if (secondCounter >= firstCounter & secondCounter + firstCounter < incoming |
                        secondCounter <= firstCounter & secondCounter + firstCounter >= incoming - 1) {
                    arrayUnderConstruct[firstCounter][secondCounter] = 1;

                } else {
                    arrayUnderConstruct[firstCounter][secondCounter] = 0;
                }
            }
        }
        return arrayUnderConstruct;
    }

    void resultIs(int[][] usersArray) {

        int size = usersArray.length;
        for (int firstCounter = 0; firstCounter < size; firstCounter ++) {
            for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                if (secondCounter < size - 1) {
                    System.out.print(usersArray[firstCounter][secondCounter] + " ");

                } else {
                    System.out.println(usersArray[firstCounter][secondCounter]);
                }
            }
        }
    }
}
