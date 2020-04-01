package task7;

//      Имеются 2 дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
//      Стороны домов - параллельны сторанам участка, в остальном размещение может быть любым.

import java.util.*;

public class TwoBuildings {

    public static void main(String[] args) {

        SquareBuilding build = new SquareBuilding();
        SquareBuilding build2 = new SquareBuilding();
        SquareBuilding squar = new SquareBuilding();

        int[] fristBuild = build.usersInputBuilding();
        int[] secondBuild = build2.usersInputBuilding();
        int[] standMyGround = squar.usersInputSquare();
        comparator(fristBuild, secondBuild, standMyGround);
    }

    static void comparator(int[] home1, int[] home2, int[] ground) {
                if(((ground[0] >= (home1[0] + home2[0])) && (ground[1] >= home1[1] && ground[1] >= home2[1])) |
                        ((ground[0] >= (home1[0] + home2[1])) && (ground[1] >= home1[1] && ground[1] >= home2[0])) |
                        ((ground[0] >= (home1[1] + home2[0])) && (ground[1] >= home1[0] && ground[1] >= home2[1])) |
                        ((ground[0] >= (home1[1] + home2[1])) && (ground[1] >= home1[0] && ground[1] >= home2[0])) |
                        ((ground[1] >= (home1[0] + home2[0])) && (ground[0] >= home1[1] && ground[0] >= home2[1])) |
                        ((ground[1] >= (home1[0] + home2[1])) && (ground[0] >= home1[1] && ground[0] >= home2[0])) |
                        ((ground[1] >= (home1[1] + home2[0])) && (ground[0] >= home1[0] && ground[0] >= home2[1])) |
                        ((ground[1] >= (home1[1] + home2[1])) && (ground[0] >= home1[0] && ground[0] >= home2[0]))) {
                        System.out.println("Everything is Ok!");
                    } else {
                        System.out.println("Your houses is too big!");
                }
    }
}

class SquareBuilding {
    String[] sides = {"First", "Second"};
    int[] sizes = new int[2];
    Scanner scn = new Scanner(System.in);

    int[] usersInputBuilding() {

        for(int i = 0; i < sides.length; i++) {
            System.out.println("Please, enter " + sides[i] + " size for your building:");

            try {
                sizes[i] = scn.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("You entered not integer value. Next time be carefully, please!");
            }
        }
        return sizes;
    }

    int[] usersInputSquare() {
        for(int i = 0; i < sides.length; i++) {
            System.out.println("Please, enter " + sides[i] + " size for your ground:");

            try {
                sizes[i] = scn.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("You entered not integer value. Next time be carefully, please!");
            }
        }
        scn.close();
        return sizes;
    }
}