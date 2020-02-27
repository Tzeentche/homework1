package task7;

import java.util.*;

public class TwoBuildings {

    int[] sizes = new int[6];
    String[] counter = {"first", "second"};
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {


    }

    int usersInput

    int usersInputBuildings() {

        String[] sides = {"A", "B", "C", "D", "E", "F"};
        String append = "";

        for(int i = 0; i < sides.length; i++) {
            if (i <2) {
                append = counter[0];
            } else if (i < 4) {

                append = counter[1];
            }

            System.out.println("Please, enter size " + sides[i] + " for building #" + append + " :");

            try {
                sizes[i] = scn.nextInt();


            } catch (InputMismatchException ex) {

                System.out.println("You entered not integer value. Next time be carefully, please!");
            }
        }
        scn.close();

        return 0;
    }

    boolean isSqareEnougth() {

        return false;
    }
}
